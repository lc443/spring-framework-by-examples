package com.leron.springsecuritydemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/home")
    public String home() {
        return "This is Home Page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is Admin Page";
    }

    @PostMapping("/")
    public User add(@RequestBody User user) {

       BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
