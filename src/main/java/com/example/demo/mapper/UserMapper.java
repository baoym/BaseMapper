package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: com.example.demo.mapper
 * @Author: BYM
 * @Date: 2019/7/1
 * @Description:
 * @Company: 本软件文档资料是北京悦图遥感科技发展有限公司的资产，任何人阅读和使用本资料必须获得相
 * 应的书面授权，承担保密责任和接受相应的法律约束.
 */
//@Mapper
public interface UserMapper extends BaseMapper<User> {
    Integer listCount();
    User findUserById(Integer id);

    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    IPage<User> selectPageVo(Page page, @Param("age") Integer age);
}
