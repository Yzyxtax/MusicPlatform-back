package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UsersMapper {


    @Select("select password,nickname from users where user_account=1")
    List<users> getById(Integer user_account);

}

