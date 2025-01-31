package com.tp.shop_kart.repo;

import com.tp.shop_kart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
