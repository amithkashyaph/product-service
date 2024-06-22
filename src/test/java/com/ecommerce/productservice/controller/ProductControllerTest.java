package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.service.ProductService;
import jakarta.inject.Inject;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {

    @MockBean
    private ProductService productService;

    @Inject
    private ProductController productController;

    void testGetAllProductsWhenListIsEmpty() {
        when(productService.getAllProducts()).thenReturn(new ArrayList<>());

    }
}
