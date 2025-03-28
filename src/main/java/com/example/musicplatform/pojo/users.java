package com.example.musicplatform.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// users.java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class users {
    private Integer user_account;
    private String password;
    private String nickname;
    private String signature;
    private String name;
    private String identification_number;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth_date;

    private boolean is_certified_singer; // 使用 Integer 或确保数据库为 tinyint(1)

    private boolean is_member;
}