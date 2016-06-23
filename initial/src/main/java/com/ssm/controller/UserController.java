package com.ssm.controller;

import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.queryUsersAll());
        return "user/listusers";
    }

}
