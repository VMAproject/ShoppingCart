package com.shoppingcart.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {

    private static final long serialVersionUID = -2054386655979281969L;


    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
    @Id
    @Column(name = "User_Name", length = 20, nullable = false)
    private String userName;
    @Column(name = "Password", length = 20, nullable = false)
    private String password;
    @Column(name = "Active", length = 1, nullable = false)
    private boolean active;
    @Column(name = "User_Role", length = 20, nullable = false)
    private String userRole;


}
