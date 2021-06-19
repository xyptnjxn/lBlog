package com.lucky.controller;


import com.lucky.common.lang.Result;
import com.lucky.entity.User;
import com.lucky.service.UserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @RequiresAuthentication
    @GetMapping("/test")
    public Object test() {
        Object result = userService.getById(1L);
        return Result.succ(result);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }
}
