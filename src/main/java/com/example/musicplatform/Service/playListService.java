package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.playList;

import java.util.List;

public interface playListService {
    /**
     * 查询歌单里的歌曲
     */
    List<playList> getPlayList(Integer playList_id);
    /**
     * 收藏歌曲到歌单
     */
    Integer addPlayList(playList playList);
    /**
     * 从歌单中删除歌曲
     */
    Integer deletePlayList(playList playList);
}
