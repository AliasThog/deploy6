package com.example.deploy5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/index")
    public String index(){
        return "Welcome thong nguyen";
    }
    @GetMapping("/view")
    public List<User> view(){
        return userRepository.findAll();
    }
}
