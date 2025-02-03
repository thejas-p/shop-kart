package com.tp.shop_kart.repo;

import com.tp.shop_kart.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
