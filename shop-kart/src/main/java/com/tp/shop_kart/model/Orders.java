package com.tp.shop_kart.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
//@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<Product> products;
    private double totalPrice;

}
