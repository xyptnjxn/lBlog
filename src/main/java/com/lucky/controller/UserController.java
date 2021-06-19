package com.lucky.controller;


import com.lucky.common.lang.Result;
import com.lucky.entity.User;
import com.lucky.service.UserService;
import io.swagger.annotations.*;
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
@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户测试", notes = "用户测试接口，用于开发过程中用户的相关测试")
    @RequiresAuthentication
    @GetMapping("/test")
    public Object test() {
        Object result = userService.getById(1L);
        return Result.succ(result);
    }

    @ApiOperation(value = "保存用户测试", notes = "保存用户测试接口，用于开发过程中用户的相关测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name="user",value="用户信息",required=true,paramType="body"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 400, message = "失败")
    })
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }
}
