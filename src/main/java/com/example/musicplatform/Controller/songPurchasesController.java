package com.example.musicplatform.Controller;

import com.example.musicplatform.Service.songPurchasesService;
import com.example.musicplatform.pojo.songPurchases;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/songPurcheases")
public class songPurchasesController {
    @Autowired
    private songPurchasesService songPurcheasesService;
    @GetMapping("/{user_account}")
    public List<songPurchases> getSongPurchases(@PathVariable Integer user_account){
        return songPurcheasesService.getSongPurchases(user_account);
    }
}
