package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {
    // UsersMapper.java
    @Select("SELECT * FROM users WHERE user_account = #{user_account}")
    List<users> getById(Integer user_account);

    @Insert("INSERT INTO users(phone_number,password) VALUES(#{phone_number}, #{password})")
    int insertUser(users users);

    @Update("Update users set "+
            "nickname=#{nickname},password=#{password},signature=#{signature},name=#{name}," +
            "identification_number=#{identification_number},gender=#{gender},birth_date=#{birth_date}," +
            "phone_number=#{phone_number} where user_account=#{user_account}")
    int updateUsers(users users);

    @Delete("Delete from users where user_account = #{user_account}")
    int deleteUser(Integer user_account);

    @Select("SELECT COUNT(1) FROM users WHERE phone_number = #{phone_number} AND password = #{password}")
    Integer validateLogin(@Param("phone_number") String phoneNumber, @Param("password") String password);
}

