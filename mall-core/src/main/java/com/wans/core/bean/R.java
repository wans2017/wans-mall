package com.wans.core.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 返回数据类
 * Created by wans on 2020/10/16.
 */
@ApiModel
@Data
public class R<T> {

    @ApiModelProperty(name = "code",value = "响应状态码")
    private Integer code;

    @ApiModelProperty(name = "msg",value = "提示消息")
    private String msg;

    @ApiModelProperty(name = "data",value = "响应数据")
    private T data;

    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {
    }

    public R(T data) {
        this.data = data;
    }

    public static<T> R<T> ok(String msg){
        R<T> resp = new R<T>();
        resp.setCode(200);//操作成功
        resp.setMsg(msg);
        return resp;
    }

    public static<T> R<T> ok(Integer code,String msg){
        R<T> resp = new R<T>();
        resp.setCode(code);//操作成功
        resp.setMsg(msg);
        return resp;
    }

    public static<T> R<T> fail(){
        R<T> resp = new R<T>();
        resp.setCode(500);//操作失败
        resp.setMsg("操作失败");
        return resp;
    }

    public static<T> R<T> fail(String msg){
        R<T> resp = new R<T>();
        resp.setCode(500);//操作失败
        resp.setMsg(msg);
        return resp;
    }

    public static<T> R<T> fail(Integer code, String msg){
        R<T> resp = new R<T>();
        resp.setCode(code);//操作失败
        resp.setMsg(msg);
        return resp;
    }

    public R<T> put(T data) {
        this.setData(data);
        return this;
    }

    public R<T> msg(String msg){
        this.setMsg(msg);
        return this;
    }

    public R<T> code(Integer code){
        this.setCode(code);
        return this;
    }


}
