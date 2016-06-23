package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2016/6/23
 *
 * @author feng.wei
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> queryUsersAll() {
        return userDao.queryUsersAll();
    }

}
