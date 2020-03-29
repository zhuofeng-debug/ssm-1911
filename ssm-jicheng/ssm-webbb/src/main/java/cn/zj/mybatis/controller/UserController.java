package cn.zj.mybatis.controller;

import java.io.File;



import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


import cn.zj.mybatis.pojo.User;
import cn.zj.mybatis.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	
	@RequestMapping("method1")
	public String selectlist(Model m) {
		System.out.println(456);
		List<User> list = service.selectList();
		m.addAttribute("users", list);
		
		System.err.println(list);
		return "user_list";
	}
	
	@RequestMapping(value = "method2")
	public String selectlist(Integer id) {
		 int deleteByPrimaryKey = service.deleteByPrimaryKey(id);
		return "redirect:/method1";
	}
	
	
	
	
}
