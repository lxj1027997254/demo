package com.example.demo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by LXJ on 2021-03-12.
 */
@Slf4j
@Configuration
public class AutoMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("auto insert..");
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "isDeleted", Integer.class, 0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("auto update..");
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}
