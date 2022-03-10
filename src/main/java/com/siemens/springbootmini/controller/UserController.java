package com.siemens.springbootmini.controller;

import com.siemens.springbootmini.dao.UserDto;
import com.siemens.springbootmini.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Create Time: 2022年03月09日 14:50          </p>
 **/

@Api(tags = "sdl-用户管理模块 user management")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //引用配置文件里的值
    @Value("${sdl}")
    private String sdl;
    //1. 参数如果有改变，直接改方法不是好的做法，好的做法是将参数封装
    //    public String login(String name, String pwd){
    //        return "success";
    //    }

    @ApiOperation("login interface 登陆接口")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody  UserDto userDto){
        String result = userService.login(userDto);
        return "success" + result +"sdl="+sdl;
    }
}
