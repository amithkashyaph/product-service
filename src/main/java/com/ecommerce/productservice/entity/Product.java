package com.ecommerce.productservice.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {

    private Long id;
    private String title;
    private String description;
    private Category category;
    private Float price;
    private Float rating;
}
