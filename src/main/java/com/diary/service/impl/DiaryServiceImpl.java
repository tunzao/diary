package com.diary.service.impl;

import com.diary.common.utils.MD5;
import com.diary.dao.UserDao;
import com.diary.domain.User;
import com.diary.domain.dto.PageResultDTO;
import com.diary.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;


import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DiaryServiceImpl implements DiaryService {
    @Override
    public void saveUser(User user) {
        try {
            user.setPassword(MD5.digest(user.getPassword()));
            userDao.save(user);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findUsers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PageResultDTO userExists(String name) {
        PageResultDTO dto = new PageResultDTO();
        try {
            boolean exists =   0 != userDao.countName(name);
            dto.setObj(exists);
        } catch (Exception e) {
            dto.setSuccess(false);
            dto.setMessage(e.getMessage());
            e.printStackTrace();
        }
        return dto;
    }

    @Autowired
    UserDao userDao;
}
