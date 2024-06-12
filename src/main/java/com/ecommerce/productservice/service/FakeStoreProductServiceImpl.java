package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.FakeProductDto;
import com.ecommerce.productservice.entity.Category;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService {

    private String fakeStoreUrl = "https://fakestoreapi.com/products/{id}";

    private String fakeStoreUrlForAllProducts = "https://fakestoreapi.com/products";

    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public List<Product> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeProductDto[]> response = restTemplate.getForEntity(fakeStoreUrlForAllProducts, FakeProductDto[].class);

        List<Product> productList = new ArrayList<>();

        for(FakeProductDto fakeProductDto: response.getBody()) {
            productList.add(getProductFromFakeProductDto(fakeProductDto));
        }
        return productList;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeProductDto> response = restTemplate.getForEntity(fakeStoreUrl, FakeProductDto.class, id);

        if(response.getBody() == null) {
            throw new ProductNotFoundException("Unable to find product id : " + id);
        }
        return getProductFromFakeProductDto(response.getBody());
    }

    @Override
    public Product addProduct(Product product) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeProductDto fakeProductDto = getFakeProductDtoFromProduct(product);
        ResponseEntity<FakeProductDto> response = restTemplate.postForEntity(fakeStoreUrlForAllProducts, fakeProductDto, FakeProductDto.class);
        return getProductFromFakeProductDto(response.getBody());
    }

    @Override
    public String updateProduct(Long id) {
        return null;
    }

    @Override
    public Product deleteProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseExtractor<ResponseEntity<FakeProductDto>> responseExtractor = restTemplate.responseEntityExtractor(FakeProductDto.class);
//        return (ResponseEntity)nonNull((ResponseEntity)this.execute(url, HttpMethod.GET, requestCallback, responseExtractor, uriVariables));
        ResponseEntity<FakeProductDto> response = restTemplate.execute(fakeStoreUrl, HttpMethod.DELETE, null, responseExtractor, id);
        return getProductFromFakeProductDto(response.getBody());
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
        fakeProductDto.setTitle(product.getTitle());
        fakeProductDto.setDescription(product.getDescription());
        fakeProductDto.setPrice(product.getPrice());
        fakeProductDto.setCategory(product.getCategory().getName());

        return fakeProductDto;
    }
}
