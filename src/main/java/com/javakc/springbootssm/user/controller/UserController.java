package com.javakc.springbootssm.user.controller;


import com.javakc.springbootssm.user.entity.User;
import com.javakc.springbootssm.user.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
@Api(tags = "【系统管理】【用户接口】")
public class UserController {

    @Autowired
    private UserService userService;

//    @PostMapping
//    @ApiOperation(value = "用户添加接口")
//    @ApiImplicitParams(
//            value = {
//                    @ApiImplicitParam(name = "id",value = "主键(添加无需干预)",required = false)
//                    }
//
//    )
//    public void insert(@RequestBody User user)
//    {
//        System.out.println("用户添加"+user);
//    }
    @GetMapping(value = "{id}",consumes = "application/json",produces = "application/json")
    @ApiOperation(value = "【主键查询】",notes ="主键ID必填信息" )
    public User get(@ApiParam(name = "id",value = "用户主键",required = true,example = "1") @PathVariable int id)
    {
        return userService.queryById(id);
    }
}
