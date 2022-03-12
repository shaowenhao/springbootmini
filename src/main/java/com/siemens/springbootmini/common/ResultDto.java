package com.siemens.springbootmini.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 响应返回类
 *
 *
 * postman 发请求  http://localhost:8083/login post
 * {
 *
 *     "name":"shao",
 *     "pwd":"123"
 * }
 *
 * 得到结果
 * {
 *     "resultCode": 1,
 *     "message": "successshao123sdl=siemens date layer test",
 *     "data": {
 *         "name": "shao",
 *         "pwd": "123"
 *     }
 * }
 *
 *
 * <p>
 *     Create Time: 2022年03月12日 15:01
 * </p>
 **/
@ApiModel (value="基础返回类",description = "基础返回类")
public class ResultDto<T> implements Serializable {


    private static final long serialVersionUID = -1710598140692224002L;
    @ApiModelProperty(value = "返回结果码1成功 0失败",required = true,example = "1",allowableValues = "1,0")
    private Integer resultCode;
    @ApiModelProperty(value = "提示信息",example = "成功",allowableValues = "成功，失败")
    private  String message = "";
    @ApiModelProperty(value = "响应结果数据")
    private  T data = null;

    public Integer getResultCode(){
        return resultCode;
    }

    public static ResultDto newInstance(){
        return new ResultDto();
    }

    public void setAsSuccess(){
        this.resultCode = 1;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage(){
        return  this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public static ResultDto success(String message){
        ResultDto resultDto = new ResultDto();
        resultDto.setAsSuccess();
        resultDto.setMessage(message);
        return resultDto;
    }

   public static <T> ResultDto<T> success(String message , T data){
       ResultDto<T> resultDto= new ResultDto<>();
       resultDto.setAsSuccess();
       resultDto.setMessage(message);
       resultDto.setData(data);
       return resultDto;
    }
}
