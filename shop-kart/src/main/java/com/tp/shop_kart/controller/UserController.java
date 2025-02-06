package com.tp.shop_kart.controller;

import com.tp.shop_kart.model.User;
import com.tp.shop_kart.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping()
    public ResponseEntity<?> addUser(@Valid @RequestBody User user1){
        User user=userService.createNewUser(user1);
        return ResponseEntity.ok(user);
    }
    @GetMapping()
    public ResponseEntity<?> getAllUser(){
        List<User> users=userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserId(@Valid @PathVariable long id){
        User user= userService.getUserById(id);
        return ResponseEntity.ok(user);

    }
}
