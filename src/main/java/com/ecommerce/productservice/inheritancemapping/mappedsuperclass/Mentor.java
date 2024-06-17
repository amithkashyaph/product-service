package com.ecommerce.productservice.inheritancemapping.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_mentor")
public class Mentor extends User {
    private Float rating;
    private Integer noOfSessions;
}
