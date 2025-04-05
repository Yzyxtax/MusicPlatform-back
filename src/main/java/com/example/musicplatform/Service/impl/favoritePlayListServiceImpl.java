package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.FavoritePlayListMapper;
import com.example.musicplatform.Service.favoritePlayListService;
import com.example.musicplatform.pojo.favoritePlayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class favoritePlayListServiceImpl implements favoritePlayListService {

    @Autowired
    FavoritePlayListMapper favoritePlayListMapper;
    @Override
    public List<favoritePlayList> getFavoritePlayList(Integer user_account) {
        return favoritePlayListMapper.getFavoritePlayList(user_account);
    }

    @Override
    public Integer insertFavoritePlayList(favoritePlayList favoritePlayList) {
        return favoritePlayListMapper.insertFavoritePlayList(favoritePlayList);
    }

    @Override
    public Integer deleteFavoritePlayList(Integer user_account, Integer favorite_playlist_id) {
        return favoritePlayListMapper.deleteFavoritePlayList(user_account, favorite_playlist_id);
    }
}
