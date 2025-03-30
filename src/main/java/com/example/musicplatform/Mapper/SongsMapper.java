package com.example.musicplatform.Mapper;


import com.example.musicplatform.pojo.songs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SongsMapper {
    @Select("select * from songs where song_id=#{songId}")
    List<songs> getById(Integer songId);
}
