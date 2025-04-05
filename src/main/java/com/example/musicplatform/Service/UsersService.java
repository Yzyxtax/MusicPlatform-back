package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.users;

import java.util.List;

public interface UsersService {
    /**
     * 查询用户
     */
    List<users> getById(Integer user_account);
    /**
     * 添加用户
     */
    int insertUsers(users users);
    /**
     * 修改用户信息
     */
    int updateUsers(users users);
    /**
     * 删除用户账号
     */
    int deleteUsers(Integer user_account);
    /**
     * 验证登录
     */
    Integer validateLogin(String phone_number, String password);
}
