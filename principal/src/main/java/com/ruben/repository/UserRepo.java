package com.ruben.repository;
import java.util.List;
import com.ruben.model.User;


public interface UserRepo {    
    public List<User> findAll();
}
