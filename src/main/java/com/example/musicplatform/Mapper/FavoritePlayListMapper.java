package com.example.musicplatform.Mapper;


import com.example.musicplatform.pojo.favoritePlayList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FavoritePlayListMapper {
    @Select("select ps.cover,ps.playlist_name from favorite_playlists fp,playlists_summary ps\n" +
            "where fp.user_account=#{user_account} and fp.favorite_playlist_id=ps.playlist_id")
    List<favoritePlayList>getFavoritePlayList(Integer user_account);

    @Insert("INSERT into favorite_playlists value(#{user_account},#{favorite_playlist_id},#{collection_time})")
    Integer insertFavoritePlayList(favoritePlayList favoritePlayList);

    @Delete("delete from favorite_playlists where user_account=#{user_account} and favorite_playlist_id=#{favorite_playlist_id}")
    Integer deleteFavoritePlayList(Integer user_account, Integer favorite_playlist_id);
}
