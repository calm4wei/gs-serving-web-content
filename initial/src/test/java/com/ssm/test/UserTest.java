package com.ssm.test;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import org.junit.Test;

import java.util.List;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */
public class UserTest {

    @Test
    public void test_queryUsersAll() {
        UserDao userDao = new UserDao();
        List<User> list = userDao.queryUsersAll();
        for (User user : list) {
            System.out.println(user.toString());

        }
    }
}
