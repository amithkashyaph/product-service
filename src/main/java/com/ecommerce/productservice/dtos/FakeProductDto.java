package com.ecommerce.productservice.dtos;

import com.ecommerce.productservice.entity.Category;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private Long price;
}
