package com.example.musicplatform.Controller;


import com.example.musicplatform.Service.UsersService;
import com.example.musicplatform.Service.impl.UsersServiceImpI;
import com.example.musicplatform.pojo.users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/users")
public class usersController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/{user_account}")
    public List<users> getUsersById(@PathVariable Integer user_account){
        return usersService.getById(user_account);
    }
}
