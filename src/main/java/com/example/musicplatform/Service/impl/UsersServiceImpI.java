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


}
