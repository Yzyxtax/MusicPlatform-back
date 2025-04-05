package com.example.musicplatform.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userFollowList {
    private Integer user_account;//用户账号
    private String nickname;//关注的用户的昵称
    private String avatar;//关注的用户的头像
}
