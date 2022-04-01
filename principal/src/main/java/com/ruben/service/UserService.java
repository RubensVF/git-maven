package com.ruben.service;

import java.util.ArrayList;
import java.util.List;

import com.ruben.model.User;

public class UserService {

    private List<User> users = new ArrayList<User>();

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        if (users.size() > 0) {
            User userAux = users.get(users.size() - 1);
            int id = userAux.getId();
            user.setId(id + 1);
            users.add(user);
        } else {
            user.setId(1);
            users.add(user);
        }
    }

    public User findById(int id) {
        User userres = null;
        for (User user : users) {
            if (user.getId() == id) {
                userres = user;
                break;
            }
        }
        return userres;
    }

    public void deleteById(int id){
        int idx = 0;
        while (idx < users.size()) {
            if (users.get(idx).getId() == id) {
                users.remove(idx);
                break;
            } else {
                ++idx;
            }
        }
    }

}
