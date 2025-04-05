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
    private Boolean requires_membership;//是否要会员
    private Double song_price;//价格
    private Boolean requires_cover;//是否是翻唱
    private Integer plays_number;//播放次数
}
