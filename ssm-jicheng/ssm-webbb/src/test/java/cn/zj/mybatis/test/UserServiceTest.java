package cn.zj.mybatis.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.mybatis.pojo.User;
import cn.zj.mybatis.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
	
	
	@Autowired
	private UserService service;
	
	@Test
	public void testInsert() {
		
		User user = new User(null, "梁焯锋", "678", 15);
		int insert = service.insert(user);
		System.out.println(insert);
	}

	@Test
	public void testDeleteByPrimaryKey() {
		int deleteByPrimaryKey = service.deleteByPrimaryKey(64);
		System.out.println(deleteByPrimaryKey);
	}

	@Test
	public void testUpdateByPrimaryKey() {
		User user = new User(2, "梁焯锋", "678", 15);
		int updateByPrimaryKey = service.updateByPrimaryKey(user);
		System.out.println(updateByPrimaryKey);
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		User user = service.selectByPrimaryKey(2);
		System.out.println(user);
	}

	
	

}
