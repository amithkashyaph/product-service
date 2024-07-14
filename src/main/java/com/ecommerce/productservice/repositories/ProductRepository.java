package com.ecommerce.productservice.repositories;

import com.ecommerce.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    List<Product> findAll();

    List<Product> findAllByTitle(String title);

    List<Product> findAllByTitleAndDescription(String title, String description);

    List<Product> findAllByPrice_ValueLessThan(Integer priceValue);

    List<Product> findAllByPrice_ValueBetween(Integer basePrice, Integer maxPrice);

}
