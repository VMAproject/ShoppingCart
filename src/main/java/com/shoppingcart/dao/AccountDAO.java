package com.shoppingcart.dao;

import com.shoppingcart.entity.Account;


public interface AccountDAO {

    Account findAccount(String userName);

}
