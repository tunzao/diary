package com.diary.service;

import com.diary.dao.UserDao;
import com.diary.domain.User;
import com.diary.domain.dto.PageResultDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DiaryService {
    void saveUser(User user);
    List<User> findUsers();

    PageResultDTO userExists(String name);
}
