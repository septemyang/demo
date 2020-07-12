package com.example.demo.service;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    //增加
    int insertUser(User user);
    //删除 by userid
    int deleteUserById(Integer id);
    //修改by userid
    int updateUserById(Integer id);
    //查一个 by userid
    User selectUserById(Integer id);
    //查所有
    List<User> selectAllUser();
}
