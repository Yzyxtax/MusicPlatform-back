package com.example.musicplatform.Service;

import com.example.musicplatform.pojo.songs;

import java.util.List;

public interface SongsService {
    List<songs> getById(Integer songId);
}
