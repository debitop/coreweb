package com.example.coreweb.service;


import com.example.coreweb.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith()
public class UserServiceTest {

    private static final String TEST_FIRST_NAME = "testFirstName";
    private static final String TEST_LAST_NAME = "testLastName";
    private static final String TEST_USER_NAME = "testUserName";
    private static final String TEST_PASSWORD = "testPassword";

    @Resource
    UserServiceImpl userService;

    @Test
    public void testCorrectPersistUser1(){
        User persistedUser = userService.save(mockUser());
        assertEquals();
        assertNotNull(persistedUser.getHashedPassword());
    }


    @After
    public void cleanUp(){

    }








    private User mockUser() {
        return User.of()
                .firstName(TEST_FIRST_NAME)
                .lastName(TEST_LAST_NAME)
                .userName(TEST_USER_NAME)
                .plainTextPassword(TEST_PASSWORD)
                .create();
    }


}
