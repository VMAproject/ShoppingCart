package com.shoppingcart.dao;


import com.shoppingcart.model.CartInfo;
import com.shoppingcart.model.OrderDetailInfo;
import com.shoppingcart.model.OrderInfo;
import com.shoppingcart.model.PaginationResult;

import java.util.List;


public interface OrderDAO {

    void saveOrder(CartInfo cartInfo);

    PaginationResult<OrderInfo> listOrderInfo(int page,
                                              int maxResult,
                                              int maxNavigationPage);

    OrderInfo getOrderInfo(String orderId);

    List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
