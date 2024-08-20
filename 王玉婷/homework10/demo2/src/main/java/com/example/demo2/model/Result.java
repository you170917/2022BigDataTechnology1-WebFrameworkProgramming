package com.example.demo2.model;

public class Result {
    private String code;
    private String message;
    private Object data;


    private static final String SUCCESS = "0";
    private static final String ERROR = "-1";

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS);
        return result;// 返回一个成功的Result对象
    }

    public static Result success(String message) {
        Result result = new Result();
        result.setCode(SUCCESS);
        result.setMsg(message);
        return result;// 返回一个成功的Result对象
    }

    public static Result success(String message, Object data) {
        Result result = new Result();
        result.setCode(SUCCESS);
        result.setMsg(message);
        result.setData(data);
        return result;// 返回一个成功的Result对象
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(ERROR);
        return result;// 返回一个失败的Result对象
    }

    public static Result error(String message) {
        Result result = new Result();
        result.setCode(ERROR);
        result.setMsg(message);
        return result;// 返回一个失败的Result对象
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMsg(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
