package com.kenton.mybatis.mapper;

import com.kenton.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    // 添加用户信息
    int insertUser();

    // 修改用户信息
    void updateUsers();

    // 删除用户
    void deleteUser();

    // id查询用户信息
    User getUserById();

    // 查询所有的用户信息
    List<User> getAllUser();
}
