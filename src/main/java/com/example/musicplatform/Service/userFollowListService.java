package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.userFollowList;
import java.util.List;

public interface userFollowListService {
    /**
     * 查询关注列表
     */
    List<userFollowList> getFollowList(Integer user_account);
}
