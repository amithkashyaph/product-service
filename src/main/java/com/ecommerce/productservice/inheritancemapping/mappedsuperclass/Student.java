package com.ecommerce.productservice.inheritancemapping.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_student")
public class Student extends User {
    private Integer psp;
    private String batchName;
}
