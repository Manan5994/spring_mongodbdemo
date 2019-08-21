package com.example.springmongodb.resource;

import com.example.springmongodb.document.User;
import com.example.springmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userRepository.save(user);
        return "User "+user.getName() +" added Successfully with id: "+user.getId();
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){

        return userRepository.findAll();
    }

    @GetMapping("/getAllUsers/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return userRepository.findById(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
        return "User with id- "+id+" deleted Successfully";
    }
}
