package com.example.myapplication.models;


import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

public class Users {

    public String username;
    public String password;

    public static Boolean passwordIsValid(String User,
                                          String Password) {
        for (Users i:getUsers()) {
            if ( i.username.equals(User)){
               if( i.password.equals(Password)){

               }
            }
        }
        return  true;
    }
    public static ArrayList<Users> getUsers() {
        ArrayList<Users> list = new ArrayList<Users>();

        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);

        Users t = new Users();
        t.username = "bichito";
        t.password = "1234567";
        list.add(t);
        return list;
    }
}
