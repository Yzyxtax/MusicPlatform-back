package com.example.musicplatform.Mapper;

import com.example.musicplatform.pojo.songPurchases;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SongPurchasesMapper {//得到歌曲的歌名，时长，作者，专辑名称
    @Select("""
            select s.song_name,s.duration,u.nickname,asu.album_name from songs s,song_purchases sp,album_released ar,albums_summary asu,albums a,users u
             where s.song_id=sp.song_id and s.song_id=a.song_id and a.album_id=ar.album_id and a.album_id=asu.album_id
             and ar.user_account=u.user_account and sp.user_account=#{user_account}""")
    List<songPurchases> getSongPurchases(Integer user_account);
}