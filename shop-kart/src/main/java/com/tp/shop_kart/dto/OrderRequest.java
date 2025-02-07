package com.tp.shop_kart.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class OrderRequest {

    @NotBlank(message = "id cannot be blank")
    private Long userId;
    @NotBlank(message = "product ids cannot br blank")
    private List<Long> productIds;

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}