package com.kenton.mybatis.mapper;

import com.kenton.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    // 添加用户信息
    int insertUser();

    // 根据用户名查询用户信息
    User getUserByUsername(String username);

    // 验证登录
    User checkLogin(String username,String password);

    // 验证登录 (参数为map)
    User checkLoginByMap(Map<String,Object> map);

    // 添加用户信息
    int insertUser2(User user);

    // 验证登录 使用@Param
    List<User> checkLoginByParam(@Param("username")String username,@Param("password")String password);

}
