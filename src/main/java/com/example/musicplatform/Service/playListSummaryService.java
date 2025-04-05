package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.playListSummary;

import java.util.List;

public interface playListSummaryService {
    /**
     * 查询用户所创建的歌单
     */
    List<playListSummary> getPlayListSummary(Integer user_account);
    /**
     * 用户创建歌单
     */
    Integer addPlayListSummary(playListSummary playListSummary);
    /**
     * 更改歌单信息
     */
    Integer updatePlayListSummary(playListSummary playListSummary);
    /**
     * 删除歌单
     */
    Integer deletePlayListSummary(Integer playlist_id);
}
