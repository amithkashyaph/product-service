package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.GenericProductDto;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    private ProductRepository productRepository;

    @Autowired
    public SearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<GenericProductDto> getAllProductsBySearchTerm(String query) {
        List<Product> productList = productRepository.findAllByTitle(query);

        List<GenericProductDto> genericProductDtoList = new ArrayList<>();
        for(Product product: productList) {
            genericProductDtoList.add(Product.from(product));
        }
        return genericProductDtoList;
    }
}
