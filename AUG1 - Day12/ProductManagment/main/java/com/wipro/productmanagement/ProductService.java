////package com.wipro.productmanagement;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import java.util.List;
////import java.util.Optional;
////
////@Service
////public class ProductService {
////
////    @Autowired
////    private ProductRepository repo;
////
////    public List<Product> getAllProducts() {
////        return repo.findAll();
////    }
////
////    public Optional<Product> getProductById(int id) {
////        return repo.findById(id);
////    }
////
////    public Product saveProduct(Product product) {
////        return repo.save(product);
////    }
////
////    public Product updateProduct(Product product) {
////        return repo.save(product);
////    }
////
////    public void deleteProduct(int id) {
////        repo.deleteById(id);
////    }
////}
//package com.wipro.productmanagement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepository repo;
//
//    public List<Product> getAllProducts() {
//        return repo.findAll();
//    }
//
//    public Optional<Product> getProductById(int id) {
//        return repo.findById(id);
//    }
//
//    public Product saveProduct(Product product) {
//        return repo.save(product);
//    }
//
//    public Product updateProduct(Product product) {
//        return repo.save(product);
//    }
//
//    public void deleteProduct(int id) {
//        repo.deleteById(id);
//    }
//
//    // ✅ New service method
//    public List<Product> getProductsByMake(String make) {
//        return repo.findByProductMake(make);
//    }
//}


//package com.wipro.productmanagement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepository repo;
//
//    public List<Product> getAllProducts() {
//        return repo.findAll();
//    }
//
//    public Optional<Product> getProductById(int id) {
//        return repo.findById(id);
//    }
//
//    public Product saveProduct(Product product) {
//        return repo.save(product);
//    }
//
//    public Product updateProduct(Product product) {
//        return repo.save(product);
//    }
//
//    public void deleteProduct(int id) {
//        repo.deleteById(id);
//    }
//
//    public List<Product> getProductsByMake(String make) {
//        return repo.findByProductMake(make);
//    }
//
//    // ✅ New method for name + make + sorted
//    public List<Product> getByNameAndMakeSorted(String name, String make) {
//        return repo.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
//    }
//}


package com.wipro.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return repo.findById(id);
    }

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public Product updateProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Product> getProductsByMake(String make) {
        return repo.findByProductMake(make);
    }

    public List<Product> getByNameAndMakeSorted(String name, String make) {
        return repo.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
    }

    // ✅ Pagination method
    public Page<Product> getPagedProducts(Pageable pageable) {
        return repo.findAll(pageable);
    }
}


