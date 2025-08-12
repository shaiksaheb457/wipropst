//package com.wipro.productmanagement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private ProductService service;
//
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return service.getAllProducts();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Product> getProduct(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @PostMapping
//    public Product addProduct(@RequestBody Product product) {
//        return service.saveProduct(product);
//    }
//
//    @PutMapping
//    public Product updateProduct(@RequestBody Product product) {
//        return service.updateProduct(product);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProduct(@PathVariable int id) {
//        service.deleteProduct(id);
//    }
//}

//
//package com.wipro.productmanagement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private ProductService service;
//
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return service.getAllProducts();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Product> getProduct(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @PostMapping
//    public Product addProduct(@RequestBody Product product) {
//        return service.saveProduct(product);
//    }
//
//    @PutMapping
//    public Product updateProduct(@RequestBody Product product) {
//        return service.updateProduct(product);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProduct(@PathVariable int id) {
//        service.deleteProduct(id);
//    }
//
//    // ✅ New endpoint for derived query
//    @GetMapping("/make/{make}")
//    public List<Product> getByMake(@PathVariable String make) {
//        return service.getProductsByMake(make);
//    
//    
//    @GetMapping("/name-make")
//    public List<Product> getByNameAndMakeSorted(
//            @RequestParam String name,
//           @RequestParam String make) {
//       return service.getByNameAndMakeSorted(name, make);
//    }
//}


package com.wipro.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // 1. Create product
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // 2. Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    // 3. Get product by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // 4. Update product
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    // 5. Delete product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

    // 6. Find by productMake
    @GetMapping("/make/{productMake}")
    public List<Product> getByProductMake(@PathVariable String productMake) {
        return service.getByProductMake(productMake);
    }

    // 7. Find by productName and productMake sorted by productName desc
    @GetMapping("/search")
    public List<Product> getByNameAndMakeSorted(
            @RequestParam String productName,
            @RequestParam String productMake) {
        return service.getByProductNameAndMakeSorted(productName, productMake);
    }

    // 8. Pagination + Sort by productPrice
    @GetMapping("/paged")
    public Page<Product> getPagedProducts(Pageable pageable) {
        return service.getPagedProducts(pageable);
    }
}

