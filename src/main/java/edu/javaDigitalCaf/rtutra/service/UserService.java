package edu.javaDigitalCaf.rtutra.service;

import edu.javaDigitalCaf.rtutra.model.User;
import edu.javaDigitalCaf.rtutra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
