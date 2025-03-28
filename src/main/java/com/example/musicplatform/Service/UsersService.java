package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.users;

import java.util.List;

public interface UsersService {
    /**
     * 查询用户
     */


    List<users> getById(Integer user_account);
}
