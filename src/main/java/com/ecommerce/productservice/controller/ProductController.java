package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.service.ProductService;
import com.ecommerce.productservice.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
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
}
