package com.ecommerce.productservice.service;

import org.springframework.web.bind.annotation.*;

public class ProductService {

    public String getAllProducts() {
        return "all products";
    }

    public String getProductById(Long id) {
        return "Product id : " + id;
    }

    public String addProduct() {
        return "adding product";
    }

    public String updateProduct(Long id) {
        return "updating product : " + id;
    }

    public String deleteProductById(Long id) {
        return "deleting product : " + id;
    }
}
