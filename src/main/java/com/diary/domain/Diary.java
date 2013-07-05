package com.diary.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Diary {
    private Integer id;
    private String content;
    private Integer userId;
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
