package com.ecommerce.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping
    public String getAllProducts() {
        return "all products";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "Product id : " + id;
    }

    @PostMapping("/")
    public String addProduct() {
        return "adding product";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable("id") Long id) {
        return "updating product : " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        return "deleting product : " + id;
    }
}
