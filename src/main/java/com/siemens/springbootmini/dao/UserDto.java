package com.siemens.springbootmini.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>Create Time: 2022年03月09日 14:55          </p>
 **/

@ApiModel(value = "用户登陆类",description = "请求类")
@Data
public class UserDto {

    @ApiModelProperty(value = "用户名",example = "shaowenhao",required = true)
    private String name;

    @ApiModelProperty(value = "密码",example = "123456",required = true)
    private  String pwd;

}
