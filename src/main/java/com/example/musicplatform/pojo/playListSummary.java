package com.example.musicplatform.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class playListSummary {
    private Integer playlist_id;
    private Integer user_account;
    private String playlist_name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate creation_time;
    private String cover;
}
