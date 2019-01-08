package com.example.coreweb.service;

import com.example.coreweb.exception.UserAlreadyExistsException;
import com.example.coreweb.model.User;
import com.example.coreweb.repository.UserRepository;
import com.example.coreweb.storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserRepository {

    @Autowired
    private UserStorage userStorage;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) throws UserAlreadyExistsException {
        user.setHashedPassword(passwordEncoder.encode(user.getPlainTextPassword()));
        return userStorage.save(user);
    }

    @Override
    public Map<Long, User> get() {
        return userStorage.getUsersPool();
    }
}
