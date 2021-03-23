package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.dao.OrderMapper;
import com.example.demo.dao.TestMapper;
import com.example.demo.domain.Order;
import com.example.demo.domain.TestTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	OrderMapper orderMapper;
	@Autowired
	TestMapper testMapper;

	@Test
	void t1() {
		Order Order = new Order();
		Order.setUserId(1);
		Order.setName("test");
		orderMapper.insert(Order);
	}

	@Test
	void insert() {
		TestTable testTable = new TestTable();
		testTable.setName("ttt");
		testMapper.insert(testTable);
	}

	@Test
	void update() {
		TestTable testTable = new TestTable();
		testTable.setId(1370192199372046338l);
		testTable.setName("update");
		testMapper.updateById(testTable);
		testMapper.update(testTable, new LambdaUpdateWrapper<TestTable>().eq(TestTable::getName, "ttt"));
	}

	@Test
	void delete() {
		testMapper.deleteById(1370192199372046338l);
		testMapper.delete(new LambdaQueryWrapper<TestTable>().eq(TestTable::getName, "ttt"));
	}

	@Test
	void selectList() {
		List<TestTable> testTables = testMapper.selectList(new QueryWrapper<TestTable>().eq("name", "ttt"));
		System.out.println(testTables);
	}

	@Test
	void selectOne() {

	}

	@Test
	void tt() {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
	}


}
