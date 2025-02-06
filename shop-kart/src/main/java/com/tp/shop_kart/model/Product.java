package com.tp.shop_kart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   // @NotNull(message = "")
    @NotBlank(message = "name is required")
    private String name;

    //@NotNull(message = "description is required")
    @NotBlank(message = "description is required")
    private String description;

    @Positive(message = "Price should be positive")
    private double price;

}
