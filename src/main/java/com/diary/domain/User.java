package com.diary.domain;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String nickName;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
