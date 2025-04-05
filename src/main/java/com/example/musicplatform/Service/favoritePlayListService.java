package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.favoritePlayList;

import java.util.List;

public interface favoritePlayListService {
    /**
     * 查询收藏的歌单
     */
    List<favoritePlayList> getFavoritePlayList(Integer user_account);
    /**
     * 收藏歌单
     */
    Integer insertFavoritePlayList(favoritePlayList favoritePlayList);
    /**
     * 取消收藏
     */
    Integer deleteFavoritePlayList(Integer user_account, Integer favorite_playlist_id);
}
