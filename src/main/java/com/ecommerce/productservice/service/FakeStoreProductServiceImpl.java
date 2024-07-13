package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.FakeProductDto;
import com.ecommerce.productservice.entity.Category;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.exception.ProductNotFoundException;
import com.ecommerce.productservice.thirdpartyclient.FakeStoreClient;
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

    private FakeStoreClient fakeStoreClient;

    @Autowired
    public FakeStoreProductServiceImpl(FakeStoreClient fakeStoreClient) {
        this.fakeStoreClient = fakeStoreClient;
    }

    @Override
    public List<Product> getAllProducts() {
        List<FakeProductDto> fakeProductDtos = fakeStoreClient.getAllProducts();
        List<Product> products = new ArrayList<>();

        for(FakeProductDto fakeProductDto : fakeProductDtos) {
            products.add(getProductFromFakeProductDto(fakeProductDto));
        }
        return products;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        FakeProductDto fakeProductDto = fakeStoreClient.getProductById(id);
        return getProductFromFakeProductDto(fakeProductDto);
    }

    @Override
    public Product addProduct(Product product) {
        FakeProductDto fakeProductDto = getFakeProductDtoFromProduct(product);
        FakeProductDto fakeProductDtoAdded = fakeStoreClient.addProduct(fakeProductDto);

        return getProductFromFakeProductDto(fakeProductDtoAdded);
    }

    @Override
    public String updateProduct(Long id) {
        return null;
    }

    @Override
    public Product deleteProductById(Long id) {
        FakeProductDto fakeProductDto = fakeStoreClient.deleteProductById(id);
        return getProductFromFakeProductDto(fakeProductDto);
    }

    public Product getProductFromFakeProductDto(FakeProductDto fakeProductDto) {
        Product product = new Product();
        product.setTitle(fakeProductDto.getTitle());
        product.setDescription(fakeProductDto.getDescription());
        product.setId(fakeProductDto.getId());
//        product.setPrice(fakeProductDto.getPrice().longValue());

        Category category = new Category();
        category.setName(fakeProductDto.getCategory());
        product.setCategory(category);

        return product;

    }

    public FakeProductDto getFakeProductDtoFromProduct(Product product) {
        FakeProductDto fakeProductDto = new FakeProductDto();
        fakeProductDto.setTitle(product.getTitle());
        fakeProductDto.setDescription(product.getDescription());
//        fakeProductDto.setPrice(product.getPrice());
        fakeProductDto.setCategory(product.getCategory().getName());

        return fakeProductDto;
    }
}
