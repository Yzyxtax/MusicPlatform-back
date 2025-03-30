package com.example.musicplatform.Controller;


import com.example.musicplatform.Service.SongsService;
import com.example.musicplatform.pojo.songs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/songs")
public class songsController {
    @Autowired
    private SongsService songsService;
    @GetMapping("/{songId}")
    public List<songs> GetSongsById(@PathVariable Integer songId) {
        return songsService.getById(songId);
    }
}
