package com.shoppingcart.dao;

import com.shoppingcart.entity.Product;
import com.shoppingcart.model.PaginationResult;
import com.shoppingcart.model.ProductInfo;


public interface ProductDAO {

    Product findProduct(String code);

    ProductInfo findProductInfo(String code);

    PaginationResult<ProductInfo> queryProducts(int page,
                                                int maxResult,
                                                int maxNavigationPage);

    PaginationResult<ProductInfo> queryProducts(int page,
                                                int maxResult,
                                                int maxNavigationPage,
                                                String likeName);

    void save(ProductInfo productInfo);

}
