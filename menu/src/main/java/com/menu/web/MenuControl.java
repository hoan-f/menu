package com.menu.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.menu.entity.JsonResult;
import com.menu.service.MenuService;

@Controller
@RequestMapping("/user")
public class MenuControl {
	@Resource
	private MenuService menuService;
	@ResponseBody
	@RequestMapping("/findAllUser.do")
	public Object findAllUser(){
		return new JsonResult(menuService.findAllUser());
	}

}
