package com.example.pgsql.result;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(0,"请求成功"),
    ERROR(-1,"请求失败");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
