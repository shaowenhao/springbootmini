package com.siemens.springbootmini.service.impl;

import com.siemens.springbootmini.dao.UserDto;
import com.siemens.springbootmini.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Service Component的语义注解 类似RequestMapping 和 GetMapping
 * <p>
 *     Create Time: 2022年03月09日 17:27
 * </p>
 **/

@Service
public class UserServiceImpl implements UserService {

    public String login(UserDto userDto){
        return userDto.getName()+userDto.getPwd();
    }
}
