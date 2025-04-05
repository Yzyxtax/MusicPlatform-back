package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.UserFollowListMapper;
import com.example.musicplatform.Service.userFollowListService;
import com.example.musicplatform.pojo.userFollowList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class userFollowListServiceImpl implements userFollowListService {

    @Autowired
    UserFollowListMapper userFollowListMapper;
    @Override
    public List<userFollowList> getFollowList(Integer user_account) {
        return userFollowListMapper.getFollowList(user_account);
    }
}
