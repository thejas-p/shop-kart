package com.tp.shop_kart.controller;

import com.tp.shop_kart.model.Product;
import com.tp.shop_kart.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@Valid @PathVariable Long id){
        return productService.getProductById(id);
    }

//    @GetMapping("/v1/{id}")
//    public ResponseEntity<?> getpd(@PathVariable long id){
//
//            Product product=productService.getProductById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + productId));
//        return ResponseEntity.ok(product);
//            //return ResponseEntity.ok(product);
//    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product){
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok("deleted product with ID "+id);
    }

}
