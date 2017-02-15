package com.shoppingcart.dao;

import com.shoppingcart.entity.Account;


public interface AccountDAO {


    void saveAccount(Account account);
    ////////////////////////////////////////////

    Account findAccount(String userName);


}
