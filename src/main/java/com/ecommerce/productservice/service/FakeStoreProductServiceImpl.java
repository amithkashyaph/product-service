package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.FakeProductDto;
import com.ecommerce.productservice.entity.Category;
import com.ecommerce.productservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{

    private String fakeStoreUrl = "https://fakestoreapi.com/products/{id}";

    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public String getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeProductDto> response = restTemplate.getForEntity(fakeStoreUrl, FakeProductDto.class, id);
        return getProductFromFakeProductDto(response.getBody());
    }

    @Override
    public String addProduct() {
        return null;
    }

    @Override
    public String updateProduct(Long id) {
        return null;
    }

    @Override
    public String deleteProductById(Long id) {
        return null;
    }

    public Product getProductFromFakeProductDto(FakeProductDto fakeProductDto) {
        Product product = new Product();
        product.setTitle(fakeProductDto.getTitle());
        product.setDescription(fakeProductDto.getDescription());
        product.setId(fakeProductDto.getId());
        product.setPrice(fakeProductDto.getPrice().longValue());

        Category category = new Category();
        category.setName(fakeProductDto.getCategory());
        product.setCategory(category);

        return product;

    }

    public FakeProductDto getFakeProductDtoFromProduct(Product product) {
        FakeProductDto fakeProductDto = new FakeProductDto();
        fakeProductDto.setId(product.getId());
        fakeProductDto.setTitle(product.getTitle());
        fakeProductDto.setDescription(product.getDescription());
        fakeProductDto.setPrice(product.getPrice());
        fakeProductDto.setCategory(product.getCategory().getName());

        return fakeProductDto;
    }
}
