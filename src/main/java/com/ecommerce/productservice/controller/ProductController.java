package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.dtos.ExceptionDto;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.exception.ProductNotFoundException;
import com.ecommerce.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        return productService.getProductById(id);
    }

    @PostMapping("/")
    public String addProduct() {
        return productService.addProduct();
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable("id") Long id) {
        return productService.updateProduct(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        return productService.deleteProductById(id);
    }


    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionDto handleProductNotFoundException(ProductNotFoundException e) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMesaage(e.getMessage());
        exceptionDto.setStatus("Failure");

        return exceptionDto;
    }
}
