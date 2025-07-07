package edu.javaDigitalCaf.rtutra.controller;


import edu.javaDigitalCaf.rtutra.model.User;
import edu.javaDigitalCaf.rtutra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-api")


public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("v1/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("v1/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("v1/additional-info")
    public List<User> getUsersByAge(@RequestParam Integer age) {
        return userRepository.findByAgeGreaterThanEqualOrderByFirstNameAsc(age);
    }

}
