package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.UsersMapper;
import com.example.musicplatform.Service.UsersService;
import com.example.musicplatform.pojo.users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UsersServiceImpI implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<users> getById(Integer user_account) {

        return usersMapper.getById(user_account);
    }

    @Override
    public int insertUsers(users users) {
        return usersMapper.insertUser(users);
    }

    @Override
    public int updateUsers(users users) {
        return usersMapper.updateUsers(users);
    }

    @Override
    public int deleteUsers(Integer user_account) {
        return usersMapper.deleteUser(user_account);
    }

    @Override
    public Integer validateLogin(String phone_number, String password) {
        return usersMapper.validateLogin(phone_number, password);
    }
}
