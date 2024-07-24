package com.ecommerce.productservice.entity;

import com.ecommerce.productservice.dtos.GenericProductDto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

    private String title;

    private String description;

    @ManyToOne
    private Category category;

    @OneToOne
    private Price price;

    private Float rating;

    @ManyToMany(mappedBy = "products")
    private List<Orders> orders;

    public static GenericProductDto from(Product product) {
        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(product.getId());
        genericProductDto.setTitle(product.getTitle());
        genericProductDto.setDescription(product.getDescription());
        genericProductDto.setCategory(product.getCategory().getName());
        genericProductDto.setPrice(product.getPrice().getValue().intValue());

        return genericProductDto;
    }
}
