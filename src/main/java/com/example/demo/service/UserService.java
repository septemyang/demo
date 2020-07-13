package com.example.demo.service;

import com.example.demo.dao.User;

import java.util.List;

public interface UserService {
    //增加
    int insertUser(User user);
    //删除 by userid
    int deleteUserById(Integer userid);
    //修改by userid
    int updateUserById(User record);
    //查一个 by userid
    User selectUserById(Integer userid);
    //查所有
    List<User> selectAllUser();
}
