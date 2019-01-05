package com.cssl.service.impl;

import com.cssl.dao.UserDao;
import com.cssl.service.UserService;
import com.cssl.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 我的电脑 on 2018/12/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVo userLogin(UserVo userVo) {
        return userDao.userLogin(userVo);
    }
}
