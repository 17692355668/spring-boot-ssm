package com.javakc.springbootssm;

import com.javakc.springbootssm.user.entity.User;
import com.javakc.springbootssm.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class SpringBootSsmApplicationTests {


    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User user=new User();
        user.setName("1");
        user.setAge(1);

        userService.insert(user);


    }

}
