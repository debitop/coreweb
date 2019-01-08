package com.example.coreweb.controller;

import com.example.coreweb.dto.UserDto;
import com.example.coreweb.model.User;
import com.example.coreweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/user/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto addUser(@RequestBody @Valid User user){
        User savedUser = userRepository.save(user);
        return UserDto.UserDtoManager.toUserDto(savedUser);
    }

    @GetMapping(value = "/user/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<Long, User> getUsers(){
        return userRepository.get();
    }
}
