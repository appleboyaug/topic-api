package com.topic.fj.api.model;

/**
 * Created by appleboyaug on 16/2/28.
 */
public class Response<T> {
    private String code;
    private T data;
    private String message;
    private String version;
    private Object attach;

    public Response() {
        this.code = "10000";
        this.message = "ok";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Object getAttach() {
        return attach;
    }

    public void setAttach(Object attach) {
        this.attach = attach;
    }
}
