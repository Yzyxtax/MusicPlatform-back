package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.SongPurchasesMapper;
import com.example.musicplatform.Service.songPurchasesService;
import com.example.musicplatform.pojo.songPurchases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class songPurcheasesServiceImpl implements songPurchasesService {
    @Autowired
    SongPurchasesMapper songPurchasesMapper;
    @Override
    public List<songPurchases> getSongPurchases(Integer user_account) {
        return songPurchasesMapper.getSongPurchases(user_account);
    }
}
