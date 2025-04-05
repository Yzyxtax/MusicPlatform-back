package com.example.musicplatform.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("is_certified_singer")
    private boolean is_certified_singer;
    @JsonProperty("is_member")
    private boolean is_member;
    @JsonProperty("is_administrator")
    private boolean is_administrator;
    private String avatar;
    private String phone_number;
}