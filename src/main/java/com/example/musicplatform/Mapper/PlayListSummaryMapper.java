package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.playListSummary;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PlayListSummaryMapper {
    @Select("select * from playlists_summary where user_account=#{user_account}")
    List<playListSummary> getPlayListSummary(Integer user_account);

    @Insert("INSERT into playlists_summary(user_account, playlist_name, creation_time, cover) " +
            "value (#{user_acount},#{playlist_name},#{creation_time},#{cover})")
    Integer insertPlayListSummary(playListSummary playListSummary);

    @Update("update playlists_summary set " +
            "playlist_name=#{playlist_name},cover=#{cover} where playlist_id=#{playlist_id}")
    Integer updatePlayListSummary(playListSummary playListSummary);

    @Delete("delete from playlists where playlist_id=#{playlist_id}")
    Integer deletePlayListSummary(Integer playlist_id);
}
