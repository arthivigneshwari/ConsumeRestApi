package com.javatechie.product.controller;

import com.javatechie.product.dto.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatechie.product.service.ProductService;

import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

            private final ProductService productService;


            public ProductController(ProductService productService){
                this.productService=productService;
                System.out.println("Inside productcontroller constructor");
            }

            @GetMapping
            public ResponseEntity<Map<Integer, Product>> getAllProducts(){
                return ResponseEntity.ok(productService.fetchAllProducts());
            }

            @GetMapping("/{id}")
            public ResponseEntity<Product> getProductById(@PathVariable int id){
                return ResponseEntity.ok(productService.fetchProductById(id));
            }
}
