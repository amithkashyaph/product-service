package com.ecommerce.productservice.service;

import com.ecommerce.productservice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customProductService")
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public String updateProduct(Long id) {
        return "updating product : " + id;
    }

    @Override
    public Product deleteProductById(Long id) {
        return null;
    }
}
