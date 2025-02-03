package com.tp.shop_kart.service;

import com.tp.shop_kart.model.Orders;
import com.tp.shop_kart.model.Product;
import com.tp.shop_kart.model.User;
import com.tp.shop_kart.repo.OrderRepository;
import com.tp.shop_kart.repo.ProductRepository;
import com.tp.shop_kart.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    public Orders createOrder(Long userId, List<Long> ProductsIds){
        User user= userRepository.findById(userId).orElseThrow(()->new RuntimeException("User not found"));
        List<Product> products=productRepository.findAllById(ProductsIds);
        double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();

        Orders orders=new Orders();
        orders.setUser(user);
        orders.setProducts(products);
        orders.setTotalPrice(totalPrice);

        return orderRepository.save(orders);
    }
}
