package com.ecommerce.productservice.inheritancemapping.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "single_student")
@DiscriminatorValue(value = "1")
public class Student extends User {
    private Integer psp;
    private String batchName;
}
