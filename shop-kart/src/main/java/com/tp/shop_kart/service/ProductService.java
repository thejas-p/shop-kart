package com.tp.shop_kart.service;

import com.tp.shop_kart.model.Product;
import com.tp.shop_kart.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
