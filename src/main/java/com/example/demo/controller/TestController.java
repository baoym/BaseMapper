package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: com.example.demo.bean
 * @Author: BYM
 * @Date: 2019/6/19
 * @Description:
 * @Company: 本软件文档资料是北京悦图遥感科技发展有限公司的资产，任何人阅读和使用本资料必须获得相
 * 应的书面授权，承担保密责任和接受相应的法律约束.
 */

@RestController
public class TestController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public Integer getUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user/count", method = RequestMethod.POST)
    public Integer listCount() {
        return userService.listCount();
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findByUserId(@PathVariable int id) {
        return userService.findUserById(id);
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findUserByWrapper() {
        return userService.findUserByWrapper();
    }

}
