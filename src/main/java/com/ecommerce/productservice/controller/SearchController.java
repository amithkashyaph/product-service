package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.dtos.GenericProductDto;
import com.ecommerce.productservice.dtos.SearchRequestDto;
import com.ecommerce.productservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping
    public List<GenericProductDto> getAllProductsForSearchTerm(@RequestBody SearchRequestDto searchRequestDto) {
        return searchService.getAllProductsBySearchTerm(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getPageSize(), searchRequestDto.getSortParamsList());
    }
}
