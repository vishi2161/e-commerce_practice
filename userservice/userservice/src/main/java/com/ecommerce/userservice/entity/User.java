package com.ecommerce.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class User {

    private Long id;

    private String name;
    private String email;
    private String password;
    private String phoneNumber;


    private  Role roles;



}
