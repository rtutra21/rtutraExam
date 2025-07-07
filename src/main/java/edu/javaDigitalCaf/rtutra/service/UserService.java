package edu.javaDigitalCaf.rtutra.service;

import edu.javaDigitalCaf.rtutra.model.User;
import edu.javaDigitalCaf.rtutra.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsersByAge(Integer age) {
        return userRepository.findByAgeGreaterThanEqualOrderByFirstNameAsc(age);
    }
}
