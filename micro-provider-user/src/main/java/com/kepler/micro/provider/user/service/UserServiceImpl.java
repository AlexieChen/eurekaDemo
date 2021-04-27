package com.kepler.micro.provider.user.service;

import com.kepler.micro.api.User;
import com.kepler.micro.provider.user.mapper.UserMapper;
import com.kepler.micro.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user){
        return userMapper.insert(user);
    }

    @Override
    public User selectById(String id){
        return userMapper.selectById(id);
    }

}
