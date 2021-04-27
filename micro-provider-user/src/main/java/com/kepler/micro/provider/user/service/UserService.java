package com.kepler.micro.provider.user.service;

import com.kepler.micro.api.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public int addUser(User user);

    public User selectById(String id);
}
