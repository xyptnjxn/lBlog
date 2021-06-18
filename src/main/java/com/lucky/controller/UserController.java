package com.lucky.controller;


import com.lucky.common.lang.Result;
import com.lucky.service.UserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lucky Love
 * @since 2021-06-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public Object test() {
        Object result = userService.getById(1L);
        return Result.succ(result);
    }
}
