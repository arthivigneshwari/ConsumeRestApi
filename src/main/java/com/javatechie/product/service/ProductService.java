package com.javatechie.product.service;

import com.javatechie.product.dao.ProductRepository;
import com.javatechie.product.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //we want to consume the api using RestClient
    private final RestClient restclient;

    public ProductService(){
        restclient = RestClient.builder()
                .baseUrl("http://localhost:8080/products")
                .build();
    }

    //write methods to consume the api
    public Map<Integer, Product> fetchAllProducts(){
        return repository.getAllProducts();
    }

    public Product fetchProductById(int id){
        Product product = repository.getProductById(id);
        if(product == null){
            throw new IllegalArgumentException("Product with id" + id +"not found.");
        }
        return product;
    }
}
