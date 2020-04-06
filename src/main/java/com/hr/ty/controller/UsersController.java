package com.hr.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import com.hr.entity.users;
import com.hr.ty.service.PageCountService;
import com.hr.ty.service.usersService;
import com.hr.util.pagination;

@Controller
@RequestMapping("users")
public class UsersController { 
	@Autowired
	private usersService us;

	@Autowired
	private PageCountService ps;
	
	@RequestMapping("/Chuang")
	@ResponseBody
	public users Chuang(HttpSession session) {
		users user = (users) session.getAttribute("user");//??
		System.out.println("得到当前用户信息。"+user);
		return  user;
	}

	@RequestMapping("/querUserByNameAndPwd")
	@ResponseBody
	public boolean querUserByNameAndPwd(HttpSession session, users user) {
		System.out.println("登录：" + user);
		users u = us.querUserByNameAndPwd(user);
		if (u != null) {
			session.setAttribute("user", u);
		} else {
			// 账号密码错误
			return false;
		}
		return true;
	}

	@RequestMapping("/querUserAndRole")
	@ResponseBody
	public Map querUserAndRole(pagination page) {
		System.out.println("查询用户+分页");
		List<users> users = us.querUserAndRole(page);
		Integer count = ps.getTableCount("users", "u_id");
		Map map = new HashMap();
		map.put("total", count);
		map.put("rows", users);
		return map;
	}

	@RequestMapping("/insertUser")
	@ResponseBody
	public int insertUser(users user) {
		System.out.println("添加用户" + user);
		return us.insertUser(user);

	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public int deleteUser(@PathVariable("id") Integer id) {
		System.out.println("删除用户" + id);
		return us.deleteByPrimaryKey(id);
	}

	@RequestMapping("/updateUserByUname")
	@ResponseBody
	public Integer updateUserByUname(users user) {
		System.out.println("修改用户：" + user);
		return us.updateByPrimaryKey(user);
	}
	
	@RequestMapping("/logout")
	public void logout (HttpSession session) {
		System.out.println("注销");
		session.removeAttribute("user");
		session.invalidate();
		
	}
	
}
