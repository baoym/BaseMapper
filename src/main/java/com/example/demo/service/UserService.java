package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.User;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @ClassName: com.example.demo.service
 * @Author: BYM
 * @Date: 2019/6/26
 * @Description:
 * @Company: 本软件文档资料是北京悦图遥感科技发展有限公司的资产，任何人阅读和使用本资料必须获得相
 * 应的书面授权，承担保密责任和接受相应的法律约束.
 */
public interface UserService {
    List<User> getUsers();

    Integer addUser(User user);

    Integer listCount();

    User findUserById(int id);

    List<User> findUserByWrapper();

    IPage<User> selectUserPage(Page<User> page, Integer state);
}
