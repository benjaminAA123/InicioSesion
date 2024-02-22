package com.iesam.InicioSesion.Domain;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User>users;

    public UserService(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public User obtainUser(String nombre){
     for (User user : users){
         if (user.getNombre().equals(nombre)){
             return user;

         }
     }
     return null;
    }

}
