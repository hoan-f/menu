package com.menu.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.menu.dao.MenuDao;
import com.menu.service.MenuService;

public class TestCode {
	ClassPathXmlApplicationContext cmt;
	@Before
	public void init(){
		cmt = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
	}
	@Test
	public void testMenuDao(){
		MenuDao menuDao = cmt.getBean("menuDao",MenuDao.class);
		List<Map<String, Object>> list = menuDao.findAllUser();
		System.out.println(list);
	}
	
	@Test
	public void testMenuService(){
		MenuService menuService = cmt.getBean("menuService",MenuService.class);
		List<Map<String, Object>> list = menuService.findAllUser();
		System.out.println(list);
	}
	
	

}
