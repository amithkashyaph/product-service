package com.ecommerce.productservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price extends BaseModel{
    private String currency;
    private Double value;
    @OneToOne(mappedBy = "price")
    private Product product;
}
