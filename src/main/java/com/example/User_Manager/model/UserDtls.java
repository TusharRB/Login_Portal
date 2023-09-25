package com.example.User_Manager.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserDtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String email;

    private String password;

    private String role;
}
