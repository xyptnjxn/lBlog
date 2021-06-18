package com.lucky.service.impl;

import com.lucky.entity.User;
import com.lucky.mapper.UserMapper;
import com.lucky.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lucky Love
 * @since 2021-06-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
