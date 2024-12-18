package dev.heimao.demo.common;

public class CommonResponse<T> {
    private int code;
    private boolean success;
    private String msg;
    private T data;


    public CommonResponse() {}



    public CommonResponse(int code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.msg = message;
        this.data = data;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}