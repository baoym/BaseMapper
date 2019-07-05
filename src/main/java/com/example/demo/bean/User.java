package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: com.example.demo.controller
 * @Author: BYM
 * @Date: 2019/6/26
 * @Description:
 * @Company: 本软件文档资料是北京悦图遥感科技发展有限公司的资产，任何人阅读和使用本资料必须获得相
 * 应的书面授权，承担保密责任和接受相应的法律约束.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("\"user\"")
public class User implements Serializable {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;//必须与表中的字段类型对应

    public User(Integer id) {
        this.id = id;
    }

}
