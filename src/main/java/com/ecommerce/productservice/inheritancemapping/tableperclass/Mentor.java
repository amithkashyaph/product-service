package com.ecommerce.productservice.inheritancemapping.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class Mentor extends User {
    private Float rating;
    private Integer noOfSessions;
}
