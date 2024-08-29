package com.ecommerce.productservice.dtos;

import com.ecommerce.productservice.entity.SortParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchRequestDto {
    private String query;
    private Integer pageSize;
    private Integer pageNumber;
    private List<SortParams> sortParamsList;
}
