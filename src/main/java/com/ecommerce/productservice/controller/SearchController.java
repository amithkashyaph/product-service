package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.dtos.GenericProductDto;
import com.ecommerce.productservice.dtos.SearchRequestDto;
import com.ecommerce.productservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
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

    @PostMapping("/list")
    public List<GenericProductDto> getAllProductsListForSearchTerm(@RequestBody SearchRequestDto searchRequestDto) {
        return searchService.getAllProductsBySearchTerm(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getPageSize(), searchRequestDto.getSortParamsList());
    }

    @PostMapping("/page")
    public Page<GenericProductDto> getAllProductsPageForSearchTerm(@RequestBody SearchRequestDto searchRequestDto) {
        List<GenericProductDto> genericProductDtoList = searchService.getAllProductsBySearchTerm(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getPageSize(), searchRequestDto.getSortParamsList());
        Page<GenericProductDto> genericProductDtoPage = new PageImpl<>(genericProductDtoList);
        return genericProductDtoPage;
    }
}
