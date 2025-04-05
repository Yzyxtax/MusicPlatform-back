package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.PlayListMapper;
import com.example.musicplatform.Service.playListService;
import com.example.musicplatform.pojo.playList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class playListServiceImpl implements playListService {

    @Autowired
    private PlayListMapper playListMapper;

    @Override
    public List<playList> getPlayList(Integer playList_id) {
        return playListMapper.getPlayList(playList_id);
    }

    @Override
    public Integer addPlayList(playList playList) {
        return playListMapper.insertPlayList(playList);
    }

    @Override
    public Integer deletePlayList(playList playList) {
        return playListMapper.deletePlayList(playList);
    }
}
