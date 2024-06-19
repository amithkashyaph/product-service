package com.ecommerce.productservice.inheritancemapping.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "joined_mentor")
public class Mentor extends User {
    private Float rating;
    private Integer noOfSessions;
}
