////package com.wipro.productmanagement;
////
////import org.springframework.data.jpa.repository.JpaRepository;
////
////public interface ProductRepository extends JpaRepository<Product, Integer> {
////}
//
//
//package com.wipro.productmanagement;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;
//
//public interface ProductRepository extends JpaRepository<Product, Integer> {
//
//    // 🔍 Derived Query: Find all products by productMake
//    List<Product> findByProductMake(String productMake);
//}



package com.wipro.productmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByProductMake(String productMake);

    // ✅ New derived query: Search by name & make, sort by name descending
    List<Product> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
}
