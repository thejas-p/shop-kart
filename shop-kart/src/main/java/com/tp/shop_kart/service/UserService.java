package com.tp.shop_kart.service;

import com.tp.shop_kart.exception.ResourceNotFoundException;
import com.tp.shop_kart.model.User;
import com.tp.shop_kart.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createNewUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){
            return user.get();

        }
        else {
            throw new ResourceNotFoundException("User with this id is not found");
        }
    }
}
