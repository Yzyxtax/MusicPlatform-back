package com.example.musicplatform.Controller;

import com.example.musicplatform.Service.userFollowListService;
import com.example.musicplatform.pojo.userFollowList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/userFollowList")
public class userFollowListController {
    @Autowired
    private userFollowListService userFollowListService;
    @GetMapping("/{user_account}")
    public List<userFollowList> userFollowList(@PathVariable("user_account") Integer user_account) {
        return userFollowListService.getFollowList(user_account);
    }
}
