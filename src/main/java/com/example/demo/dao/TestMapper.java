package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.TestTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by LXJ on 2021-03-11.
 */
@Mapper
public interface TestMapper extends BaseMapper<TestTable> {
}
