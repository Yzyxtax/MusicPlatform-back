package com.example.musicplatform.Service.impl;

import com.example.musicplatform.Mapper.SongsMapper;
import com.example.musicplatform.Service.SongsService;
import com.example.musicplatform.pojo.songs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SongsServiceImpl implements SongsService {

    @Autowired
    private SongsMapper songsMapper;

    @Override
    public List<songs> getById(Integer songId) {
        return songsMapper.getById(songId);
    }
}
