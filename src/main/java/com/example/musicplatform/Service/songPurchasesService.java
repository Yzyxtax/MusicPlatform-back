package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.songPurchases;

import java.util.List;

public interface songPurchasesService {
    /**
     * 查询购买歌曲信息
     */
    List<songPurchases> getSongPurchases(Integer user_account);
}
