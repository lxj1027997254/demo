package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by LXJ on 2021-03-11.
 */
@Data
@TableName("t_order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    private Integer userId;
    private String name;
}
