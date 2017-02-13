package com.shoppingcart.dao.impl;

import com.shoppingcart.dao.AccountDAO;
import com.shoppingcart.entity.Account;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


// Transactional for Hibernate
@Transactional
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;
//
//    private Session getCurrentSession() {
//        return sessionFactory.getCurrentSession();
//    }
//
//    @Override
//    public Account findById(String userName) {
//        Account account = (Account)getCurrentSession().get(Account.class,userName);
//        return account;
//    }
//
//    @Override
//    public void saveAccount(Account account) {
////        Account saveAccount
//
//
//    }
//
//    @Override
//    public void deleteAccountByUserName(String userName) {
//
//    }
//
//    @Override
//    public List<Account> allAccounts() {
//        return null;
//    }

    @Override
    public Account findAccount(String userName) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Account.class);
        crit.add(Restrictions.eq("userName", userName));
        return (Account) crit.uniqueResult();
    }

}