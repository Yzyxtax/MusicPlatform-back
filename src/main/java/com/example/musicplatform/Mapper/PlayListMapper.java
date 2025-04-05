package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.playList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayListMapper {
    @Select("SELECT * from playlists where playlist_id=#{playList_id}")
    List<playList> getPlayList(Integer playList_id);

    @Insert("insert into playlists value (#{playlist_id},#{song_id})")
    Integer insertPlayList(playList playList);

    @Delete("delete from playlists where song_id=#{song_id} and playlist_id=#{playlist_id}")
    Integer deletePlayList(playList playList);
}
