package com.example.coreweb.repository;

import com.example.coreweb.exception.UserAlreadyExistsException;
import com.example.coreweb.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepository {

    User save(User user) throws UserAlreadyExistsException;

    Map<Long, User> get();
}
