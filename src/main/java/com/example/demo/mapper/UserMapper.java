package com.example.demo.mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //增加用户
    @Insert("insert into user(userid,username,userpassword,userage,userroll)values(#{userid},#{username},#{userpassword},#{userage},#{userroll})")
    int insert(User user);
    //删
    @Delete("delete from user where userid=#{userid}")
    int deleteUserById(Integer userid);
    //改(很奇怪，将所有列都更新成userid的值了。
    @Update("update user set username=#{username},userpassword=#{userpassword},userage=#{userage},userroll=#{userroll} where userid=#{userid}")
    int updateUserById(User userid);
    //查一个
    @Select("select userid,username,userpassword,userage,userroll from user where userid=#{userid}")
    User selectUserById(Integer userid);
    //查所有
    @Select("select userid,username,userpassword,userage,userroll from user")
    List<User> selectAllUser();
}
