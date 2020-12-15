package com.javakc.springbootssm.user.service;

import com.javakc.springbootssm.user.dao.UserDao;
import com.javakc.springbootssm.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false)
    public int insert(User user)
    {
        return userDao.insert(user);
    }
    @Transactional(readOnly = false)

    public User queryById(int id)
    {
        return userDao.queryById(id);
    }
}
