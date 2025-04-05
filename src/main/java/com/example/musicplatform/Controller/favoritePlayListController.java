package com.example.musicplatform.Controller;
import com.example.musicplatform.Service.favoritePlayListService;
import com.example.musicplatform.pojo.favoritePlayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/favoritePlayList")
public class favoritePlayListController {
    @Autowired
    private favoritePlayListService favoritePlayListService;
    @GetMapping("/{user_account}")
    public List<favoritePlayList> getFavoritePlayList(@PathVariable Integer user_account){
        return favoritePlayListService.getFavoritePlayList(user_account);
    }

    @PostMapping("/collection")
    public Integer addFavoritePlayList(@RequestBody favoritePlayList favoritePlayList){
        return favoritePlayListService.insertFavoritePlayList(favoritePlayList);
    }

    @DeleteMapping("/unfavorite")
    public Integer deleteFavoritePlayList(Integer user_account, Integer favorite_playlist_id){
        return favoritePlayListService.deleteFavoritePlayList(user_account, favorite_playlist_id);
    }
}
