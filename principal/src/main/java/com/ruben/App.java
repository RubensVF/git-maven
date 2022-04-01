package com.ruben;

import java.util.List;

import com.ruben.model.User;
import com.ruben.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService uService = new UserService();

        //add new line only
        User user = new User("Ruben", "a@a.a");
        User user2 = new User("Ruben2", "a2@a.a");
        User user3= new User("Ruben3","a3@a.a");
        uService.save(user);
        uService.save(user2);
        List<User> users = uService.findAll();
        uService.deleteById(1);
        uService.deleteById(2);
        uService.save(user3);
        for(User useraux: users){
            System.out.println(useraux);
        }
        
    }
}
