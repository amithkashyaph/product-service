package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.dtos.GenericProductDto;
import com.ecommerce.productservice.dtos.SearchRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    public List<GenericProductDto> getAllProductsForSearchTerm(@RequestBody SearchRequestDto searchRequestDto) {
        return null;
    }
}
