package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;
//    static对象可以在它的任何对象创建之前访问，无需引用任何对象。
    public static Result success() {
        return new Result(200, "success", null);
    }

    public static Result success(String msg, Object data) {
        return new Result(200, msg, data);
    }

    public static Result success(String msg) {
        return new Result(200, msg, null);
    }

    public static Result success(Object data) {
        return new Result(200, "success", data);
    }

    public static Result error(String msg) {
        return new Result(-1, msg, null);
    }

    public static Result error(Integer code, String msg) {
        return new Result(code, msg, null);
    }
}
