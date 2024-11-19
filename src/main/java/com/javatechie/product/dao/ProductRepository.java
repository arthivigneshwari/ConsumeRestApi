package com.javatechie.product.dao;

import com.javatechie.product.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductRepository {

        public static final Map<Integer, Product> PRODUCTS = Map.of( //immutable repository
                1,Product.builder()
                        .id(1)
                        .name("Laptop")
                        .price(75000.00)
                        .description("High-performance laptop")
                        .productType("Electronics")
                        .vatPrice(null)//Optional field
                        .build(),
                2,Product.builder()
                        .id(2)
                        .name("Smartphone")
                        .price(25000.00)
                        .description("Latest smartphone")
                        .productType("Electronics")
                        .vatPrice(1250.00)//Optional field provided
                        .build(),
                3,Product.builder()
                        .id(3)
                        .name("Desk Chair")
                        .price(5000.00)
                        .description("Ergonomics office chair")
                        .productType("Furniture")
                        .vatPrice(null)//Optional field
                        .build()
        );

        //method to get a product by id
        public Product getProductById(int id){
            return PRODUCTS.get(id);
        }

        //method to get all products
        public Map<Integer,Product> getAllProducts(){
            return PRODUCTS;
        }
}
