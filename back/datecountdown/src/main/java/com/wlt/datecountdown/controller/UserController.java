package com.wlt.datecountdown.controller;

import com.wlt.datecountdown.entity.MyUserEntity;
import com.wlt.datecountdown.service.UserService;
import com.wlt.datecountdown.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody(required=false) MyUserEntity user){
        try{
            return ResponseDTO.ok(userService.register(user));
        }catch(Exception e){
            return ResponseDTO.failed(e.getMessage());
        }

    }

}
