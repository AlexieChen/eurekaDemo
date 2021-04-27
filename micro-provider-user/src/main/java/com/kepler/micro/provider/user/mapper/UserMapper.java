package com.kepler.micro.provider.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kepler.micro.api.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
