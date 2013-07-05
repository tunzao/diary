package com.diary.dao;

import com.diary.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    void save(User user);
    List<User> findUsers();

    /**
     * 统计用户名的个数
     * @param name 用户名
     * @return
     */
    Integer countName(String name);

    /**
     * 统计电子邮件的个数
     * @param email 邮件地址
     * @return
     */
    Integer countEmail(String email);
}
