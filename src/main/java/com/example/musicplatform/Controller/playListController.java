package com.example.musicplatform.Controller;


import com.example.musicplatform.Service.playListService;
import com.example.musicplatform.pojo.playList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/playList")
public class playListController {
    @Autowired
    private playListService playListService;
    @GetMapping("/{playList_id}")
    public List<playList> getPlayList(@PathVariable Integer playList_id){
        return playListService.getPlayList(playList_id);
    }

    @PostMapping("/collection")
    public Integer addCollection(@RequestBody playList playList){
        return playListService.addPlayList(playList);
    }

    @DeleteMapping("/unfavorite")
    public Integer unfavorite(@RequestBody playList playList){
        return playListService.deletePlayList(playList);
    }
}
