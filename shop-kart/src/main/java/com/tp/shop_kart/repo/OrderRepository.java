package com.tp.shop_kart.repo;

import com.tp.shop_kart.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
