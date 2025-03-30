package com.example.musicplatform.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class songs {
    private Integer song_id;//歌曲ID
    private String song_name;//歌曲名称
    private String song_description;//歌曲简介
    private String lyrics;//歌词
    private String duration;//时长
    private String genre;//流派
    private Boolean requires_membership;
    private Double song_price;
    private Boolean requires_cover;
    private Integer plays_number;
}
