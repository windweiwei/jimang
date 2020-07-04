package com.jimang.restful.service.impl;

import com.jimang.restful.entity.User;
import com.jimang.restful.mapper.UserMapper;
import com.jimang.restful.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jw
 * @since 2020-07-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
