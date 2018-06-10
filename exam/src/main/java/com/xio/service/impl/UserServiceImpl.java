package com.xio.service.impl;

import com.xio.mapper.UserMapper;
import com.xio.pojo.SUser;
import com.xio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author itdaxio
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SUser checkUser(SUser user) {
        return userMapper.checkUser(user);
    }
}
