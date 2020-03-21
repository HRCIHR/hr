package com.hr.ty.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.entity.users;
import com.hr.ty.service.usersService;

@Controller
@RequestMapping("users")
public class UsersController {
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
}
