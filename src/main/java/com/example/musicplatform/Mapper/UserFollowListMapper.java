package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.userFollowList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserFollowListMapper {//只显示头像和昵称
    @Select("SELECT u.user_account,users.nickname,users.avatar from user_follow_list u,users where u.user_account=#{user_account} and u.followed_user_account=users.user_account")
    List<userFollowList> getFollowList(Integer user_account);
}
