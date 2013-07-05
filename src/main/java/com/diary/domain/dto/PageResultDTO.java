package com.diary.domain.dto;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/4/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class PageResultDTO {
    private Integer code = 0;
    private Object obj;
    private List list;
    private boolean success = true;
    private String message = "";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
