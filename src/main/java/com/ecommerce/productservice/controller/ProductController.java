package com.ecommerce.productservice.controller;

public class ProductController {

    public String getAllProducts() {
        return "all products";
    }

    public String getProductById(Long id) {
        return "Product id : " + id;
    }

    public String addProduct() {
        return "adding product";
    }

    public String updateProduct() {
        return "updating product";
    }

    public String deleteProductById(Long id) {
        return "deleting product : " + id;
    }
}
