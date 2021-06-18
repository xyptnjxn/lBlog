package com.lucky.service.impl;

import com.lucky.entity.Blog;
import com.lucky.mapper.BlogMapper;
import com.lucky.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
