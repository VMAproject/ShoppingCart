package com.shoppingcart.model;

import com.shoppingcart.entity.Product;
import lombok.Data;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Data
public class ProductInfo {
    private String code;
    private String name;
    private double price;

    private boolean newProduct = false;

    // Upload file.
    private CommonsMultipartFile fileData;

    public ProductInfo() {
    }

    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }

    // Không thay đổi Constructor này,
    // nó được sử dụng trong Hibernate query.
    public ProductInfo(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

}
