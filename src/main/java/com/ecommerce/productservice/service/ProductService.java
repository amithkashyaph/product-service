package com.ecommerce.productservice.service;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();


    Product getProductById(Long id) throws ProductNotFoundException;

    Product addProduct(Product product);

    String updateProduct(Long id);

    String deleteProductById(Long id);
}
