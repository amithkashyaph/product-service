package com.ecommerce.productservice.inheritancemapping.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_student")
public class Student extends User {
    private Integer psp;
    private String batchName;
}
