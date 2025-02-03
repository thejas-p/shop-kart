package com.tp.shop_kart.controller;

import com.tp.shop_kart.dto.OrderRequest;
import com.tp.shop_kart.model.Orders;
import com.tp.shop_kart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

//    @PostMapping
//    public Orders CreateOrder(@RequestParam Long userId, @RequestParam List<Long> productIds){
//        return orderService.createOrder(userId, productIds);
//    }
    @PostMapping
    public Orders createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.createOrder(orderRequest.getUserId(), orderRequest.getProductIds());
    }



}
