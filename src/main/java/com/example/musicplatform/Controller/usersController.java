package com.example.musicplatform.Controller;


import com.example.musicplatform.Result.Result;
import com.example.musicplatform.Service.UsersService;
import com.example.musicplatform.pojo.LoginRequest;
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

    /**
     * 查询用户
     * @param user_account
     * @return
     */
    @GetMapping("/{user_account}")
    public List<users> getUsersById(@PathVariable Integer user_account){
        return usersService.getById(user_account);
    }

    /**
     * 注册账号
     * @param users
     * @return
     */
    @PostMapping("/register")
    public int insertUsers(@RequestBody users users){
        return usersService.insertUsers(users);
    }

    /**
     * 修改个人信息
     * @param users
     * @return
     */
    @PutMapping("/update")
    public int updateUsers(@RequestBody users users){
        return usersService.updateUsers(users);
    }

    /**
     * 注销账户
     * @param user_account
     * @return
     */
    @DeleteMapping("/{user_account}")
    public int deleteUsers(@PathVariable Integer user_account){
        return usersService.deleteUsers(user_account);
    }

    /**
     * 验证登陆
     * @param loginRequest
     * @return
     */
    @PostMapping("/login")
    public Result<users> login(@RequestBody LoginRequest loginRequest) {
        String phoneNumber = loginRequest.getPhone_number();
        String password = loginRequest.getPassword();
        Integer result = usersService.validateLogin(phoneNumber, password);
        if (result != null && result == 1) {
            return Result.success();
        } else {
            return Result.error("密码错误或用户不存在");
        }
    }
}