package com.hr.ty.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.users;
import com.hr.ty.service.usersService;
import com.hr.util.pagination;

@Controller
@RequestMapping("users")
public class UsersController { //登录
	@Autowired
	private usersService us;
	@RequestMapping("/querUserByNameAndPwd")
	public String querUserByNameAndPwd(HttpSession session,users user) {
		System.out.println("登录："+user);
		users u = us.querUserByNameAndPwd(user);
		if(u!=null) {
			session.setAttribute("user", u);
		}else {
			//账号密码错误
			return "redirect:../login.jsp";
		}
		return "redirect:../hr/page/main.jsp";
		
	}
	
	@RequestMapping("/querUserAndRole")
	@ResponseBody
	public List querUserAndRole(pagination page) {
		System.out.println("users-querUserAndRole");
		System.out.println("查询全部用户"+page);
		List<users> users = us.querUserAndRole(page);
		System.out.println( users);
		return users;
	}
}
