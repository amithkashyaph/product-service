package com.ecommerce.productservice.inheritancemapping.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "joined_student")
public class Student extends User {
    private Integer psp;
    private String batchName;
}
