package com.shoppingcart.service;


import com.shoppingcart.dao.AccountDAO;
import com.shoppingcart.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountDAO {


    private final AccountDAO accountDAO;

    @Autowired
    public AccountServiceImpl(@Qualifier("accountDAO") AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    @Transactional
    public void saveAccount(Account account) {
        this.accountDAO.saveAccount(account);

    }

    @Override
    public Account findAccount(String userName) {
        return null;
    }
}
