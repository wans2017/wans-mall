package com.wans.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 返回数据类
 * Created by wans on 2020/10/16.
 */
@ApiModel
@Data
public class Resp<T> {

    @ApiModelProperty(name = "code",value = "响应状态码")
    private Integer code;

    @ApiModelProperty(name = "msg",value = "提示消息")
    private String msg;

    @ApiModelProperty(name = "data",value = "响应数据")
    private T data;

    public Resp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Resp() {
    }

    public Resp(T data) {
        this.data = data;
    }

    public static<T> Resp<T> ok(){
        Resp<T> resp = new Resp<T>();
        resp.setCode(200);//操作成功
        resp.setMsg("操作成功");
        return resp;
    }

    public static<T> Resp<T> ok(T data){
        Resp<T> resp = new Resp<T>();
        resp.setCode(200);//操作成功
        resp.setMsg("操作成功");
        resp.setData(data);
        return resp;
    }

    public static<T> Resp<T> ok(Integer code,String msg){
        Resp<T> resp = new Resp<T>();
        resp.setCode(code);//操作成功
        resp.setMsg(msg);
        return resp;
    }

    public static<T> Resp<T> fail(){
        Resp<T> resp = new Resp<T>();
        resp.setCode(500);//操作失败
        resp.setMsg("操作失败");
        return resp;
    }

    public static<T> Resp<T> fail(String msg){
        Resp<T> resp = new Resp<T>();
        resp.setCode(500);//操作失败
        resp.setMsg(msg);
        return resp;
    }

    public static<T> Resp<T> fail(Integer code, String msg){
        Resp<T> resp = new Resp<T>();
        resp.setCode(code);//操作失败
        resp.setMsg(msg);
        return resp;
    }

    public Resp<T> put(T data) {
        this.setData(data);
        return this;
    }

    public Resp<T> msg(String msg){
        this.setMsg(msg);
        return this;
    }

    public Resp<T> code(Integer code){
        this.setCode(code);
        return this;
    }


}
