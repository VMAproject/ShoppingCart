package com.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
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

//
//    @Autowired
//    private AccountDAO accountDAO;

    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }



}
