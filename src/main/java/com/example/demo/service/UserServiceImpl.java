package com.example.demo.service;

import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUserById(Integer userid) {
        return userMapper.deleteUserById(userid);
    }

    @Override
    public int updateUserById(User record) {
        return userMapper.updateUserById(record);
    }

    @Override
    public User selectUserById(Integer userid) {
        return userMapper.selectUserById(userid);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
