package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.GenericProductDto;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    private ProductRepository productRepository;

    @Autowired
    public SearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<GenericProductDto> getAllProductsBySearchTerm(String query, int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        List<Product> productList = productRepository.findAllByTitleContaining(query, pageRequest);

        List<GenericProductDto> genericProductDtoList = new ArrayList<>();
        for(Product product: productList) {
            genericProductDtoList.add(Product.from(product));
        }
        return genericProductDtoList;
    }
}
