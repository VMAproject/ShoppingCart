package com.shoppingcart.controller;

import com.shoppingcart.dao.AccountDAO;
import com.shoppingcart.entity.Account;
import com.shoppingcart.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Created_by Mikhail Verlamov.
 * @Mail: verlamov.m@gmail.com.
 * Date 13.02.17 Time 17:24
 */
@Controller
// Enable Hibernate Transaction.
@Transactional
// Need to use RedirectAttributes
@EnableWebMvc
public class RegistrationController {


    private AccountService accountService;

    @Qualifier("accountDAO")
    @Autowired
    private AccountDAO accountDAO;


//    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
//    public String addBook(@ModelAttribute("book") Book book){
//        if(book.getId() == 0){
//            this.bookService.addBook(book);
//        }else {
//            this.bookService.updateBook(book);
//        }
//
//        return "redirect:/books";
//    }


    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String newAccount(ModelMap modelMap) {
        Account account = new Account();
        modelMap.addAttribute("account", account);
        modelMap.addAttribute("edit", false);
        return "registration";
    }
    
}

