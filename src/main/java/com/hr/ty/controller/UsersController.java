package com.hr.ty.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.users;
import com.hr.ty.service.PageCountService;
import com.hr.ty.service.usersService;
import com.hr.util.pagination;

@Controller
@RequestMapping("users")
public class UsersController { // 登录
	@Autowired
	private usersService us;

	@Autowired
	private PageCountService ps;

	@RequestMapping("/querUserByNameAndPwd")
	public String querUserByNameAndPwd(HttpSession session, users user) {
		System.out.println("登录：" + user);
		users u = us.querUserByNameAndPwd(user);
		if (u != null) {
			session.setAttribute("user", u);
		} else {
			// 账号密码错误
			return "redirect:../login.jsp";
		}
		return "redirect:../hr/page/main.jsp";

	}

	@RequestMapping("/querUserAndRole")
	@ResponseBody
	public Map querUserAndRole(pagination page) {
		System.out.println("users-querUserAndRole");
		List<users> users = us.querUserAndRole(page);
		Integer count = ps.getTableCount("users", "u_id");
		System.out.println("总行数" + count);
		System.out.println("查询全部用户" + users);
		Map map = new HashMap();
		map.put("total", count);
		map.put("rows", users);
		return map;
	}

	@RequestMapping("/insertUser")
	public void insertUser(users user) {
		System.out.println("添加用户" + user);
		Integer integer = us.insertUser(user);
		if (integer > 0) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}
	}
}
