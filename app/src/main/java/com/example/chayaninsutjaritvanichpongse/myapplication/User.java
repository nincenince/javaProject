package com.example.chayaninsutjaritvanichpongse.myapplication;

public class User {
    String email;
    String address;
    String password;
    String debit;
    User(String email, String password, String address, String debit)
    {
        this.email=email;
        this.password=password;
        this.address=address;
        this.debit=debit;
    }
}
