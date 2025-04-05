package com.example.musicplatform.Controller;


import com.example.musicplatform.Service.playListSummaryService;
import com.example.musicplatform.pojo.playListSummary;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/playListSummary")
public class playListSummaryController {
    @Autowired
    private playListSummaryService playListSummaryService;

    /**
     * 查询创建歌单
     * @param user_account
     * @return
     */
    @GetMapping("/{user_account}")
    public List<playListSummary> getPlayListSummary(@PathVariable Integer user_account) {
        return playListSummaryService.getPlayListSummary(user_account);
    }

    /**
     * 创建歌单
     * @param playListSummary
     * @return
     */
    @PostMapping("/create")
    public Integer createPlayListSummary(@RequestBody playListSummary playListSummary) {
        return playListSummaryService.addPlayListSummary(playListSummary);
    }

    /**
     * 修改歌单信息
     * @param playListSummary
     * @return
     */
    @PutMapping("/update")
    public Integer updatePlayListSummary(playListSummary playListSummary) {
        return playListSummaryService.updatePlayListSummary(playListSummary);
    }

    /**
     * 删除歌单
     * @param playlist_id
     * @return
     */
    @DeleteMapping("/{playlist_id}")
    public Integer deletePlayListSummary(Integer playlist_id) {
        return playListSummaryService.deletePlayListSummary(playlist_id);
    }
}
