package com.menu.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.menu.dao.MenuDao;
@Service("menuService")
public class MenuServiceImp implements MenuService {
	@Resource
	private MenuDao menuDao;

	public List<Map<String, Object>> findAllUser() {
		List<Map<String, Object>> list = menuDao.findAllUser();
		return list;
	}

}
