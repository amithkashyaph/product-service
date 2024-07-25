package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;


@SpringBootTest
public class ProductControllerTest {

    @MockBean
    @Qualifier("customProductService")
    private ProductService productService;

    @Autowired
    private ProductController productController;

    @Test
    void testGetAllProductsWhenListIsEmpty() {
        when(productService.getAllProducts()).thenReturn(Collections.emptyList());

        List<Product> productList = productController.getAllProducts();

        Assertions.assertTrue(productController.getAllProducts().isEmpty());
    }
}
