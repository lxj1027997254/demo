package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * Created by LXJ on 2021-03-11.
 */
@Data
@TableName("test")
public class TestTable {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(exist = false)
    private String uuid;

    private String name;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic(value = "0", delval = "1")
    private Integer isDeleted;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
}
