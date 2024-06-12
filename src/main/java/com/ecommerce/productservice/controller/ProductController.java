package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    private ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping
    public String getAllProducts() {
        return productServiceImpl.getAllProducts();
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return productServiceImpl.getProductById(id);
    }

    @PostMapping("/")
    public String addProduct() {
        return productServiceImpl.addProduct();
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable("id") Long id) {
        return productServiceImpl.updateProduct(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        return productServiceImpl.deleteProductById(id);
    }
}
