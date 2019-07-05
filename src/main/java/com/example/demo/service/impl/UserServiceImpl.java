package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public Integer addUser(User user) {
        Integer insert = userMapper.insert(user);//返回的影响数据库行数
        return insert;
    }

    @Override
    public Integer listCount() {
        return userMapper.listCount();
    }
    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findUserByWrapper() {
        return userMapper.selectList(new QueryWrapper<User>().eq("age",24));
    }

    @Override
    public IPage<User> selectUserPage(Page<User> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为非 0 时(默认为 0),分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return userMapper.selectPageVo(page, state);
    }
}
