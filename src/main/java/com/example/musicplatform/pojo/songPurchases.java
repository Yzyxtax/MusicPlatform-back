package com.example.musicplatform.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class songPurchases {
    private String song_name;
    private String nickname;
    private String album_name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate duration;
}
