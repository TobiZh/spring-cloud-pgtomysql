package com.example.pgsql.feign;

import lombok.Data;

@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;


    public static Result SUCCESS(Object data){
        Result result=new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static Result SUCCESS(){
        Result result=new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        return result;
    }

    public static Result ERROR(){
        Result result=new Result();
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(ResultCode.ERROR.getMsg());

        return result;
    }

    public static Result ERROR(String msg){
        Result result=new Result();
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(msg);

        return result;
    }

    public static Result ERROR(ResultCode resultCode){
        Result result=new Result();
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getMsg());
        return result;
    }
}
