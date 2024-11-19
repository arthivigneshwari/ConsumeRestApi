package com.javatechie.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private final int id;
    private final String name;
    private final double price;
    private final String description;
    private final String productType;
    private final Double vatPrice; //Optional field
}
