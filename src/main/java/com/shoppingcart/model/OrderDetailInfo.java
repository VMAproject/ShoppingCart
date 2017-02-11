package com.shoppingcart.model;

import lombok.Data;

@Data
public class OrderDetailInfo {


    private String id;

    private String productCode;
    private String productName;

    private int quanity;
    private double price;
    private double amount;

    public OrderDetailInfo() {

    }

    // Using for Hibernate Query.
    public OrderDetailInfo(String id, String productCode,
                           String productName, int quanity, double price, double amount) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.quanity = quanity;
        this.price = price;
        this.amount = amount;
    }

}