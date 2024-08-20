package com.example.homework05.util;

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
    public static Result success(){
        return new Result(200, "success", null);
    }
    public static Result success(String msg, Object data){
        return new Result(200, msg, data);
    }
    public static Result success(String msg){
        return new Result(200, msg, null);
    }
    public static Result success(Object data){
        return new Result(200, "success", data);
    }
    public static Result error(String msg){
        return new Result(-1, msg, null);
    }
    public static Result error(Integer code, String msg){
        return new Result(code, msg, null);
    }

}
