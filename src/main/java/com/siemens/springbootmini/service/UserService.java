package com.siemens.springbootmini.service;

import com.siemens.springbootmini.dao.UserDto;

public interface UserService {
    public String login(UserDto userDto);
}
