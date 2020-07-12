package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/add")
    public String users() {
        User user = new User();
        user.setId(3);
        user.setUsername("杨波");
        user.setUserpassword("abc");
        user.setUserage(18);
        user.setUserroll("admin");
        int result = userService.insertUser(user);
        return result + "";
    }
    @RequestMapping("/delete")
    public String delete(){
        int result= userService.deleteUserById(3);
        return result+"";
    }
    @RequestMapping("/update")
    public String update(){
        User user = new User();
        user.setUsername("杨波");
        user.setUserpassword("abc");
        user.setUserage(18);
        user.setUserroll("admin");
        int result=userService.updateUserById(2);
        return result+"";
    }
    @RequestMapping("/selectone")
    public String selectone(){
        User user=userService.selectUserById(1);
        return user.toString();
    }
    @RequestMapping("/selectall")
    public String selectall(){
        List<User> users= userService.selectAllUser();
        users.stream().forEach(System.out::println);
        return users.toString();

    }




}
