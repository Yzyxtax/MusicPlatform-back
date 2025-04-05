package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.PlayListSummaryMapper;
import com.example.musicplatform.Service.playListSummaryService;
import com.example.musicplatform.pojo.playListSummary;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class playListSummaryServiceImpl implements playListSummaryService {

    @Autowired
    private PlayListSummaryMapper playListSummaryMapper;

    @Override
    public List<playListSummary> getPlayListSummary(Integer user_account) {
        return playListSummaryMapper.getPlayListSummary(user_account);
    }

    @Override
    public Integer addPlayListSummary(playListSummary playListSummary) {
        return playListSummaryMapper.insertPlayListSummary(playListSummary);
    }

    @Override
    public Integer updatePlayListSummary(playListSummary playListSummary) {
        return playListSummaryMapper.updatePlayListSummary(playListSummary);
    }

    @Override
    public Integer deletePlayListSummary(Integer playlist_id) {
        return playListSummaryMapper.deletePlayListSummary(playlist_id);
    }
}
