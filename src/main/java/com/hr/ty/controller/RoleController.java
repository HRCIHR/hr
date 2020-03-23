package com.hr.ty.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.sys_role;
import com.hr.ty.service.sys_roleService;

@Controller
@RequestMapping("role")
@ResponseBody
public class RoleController {
	@Autowired
	private sys_roleService ss;
     @RequestMapping("/queryRoleJson")
     public void queryRoleJson(HttpServletRequest req,HttpServletResponse resp) {
    	 List<sys_role> list = ss.queryRole();
    	 req.setAttribute("role",list);
    	 System.out.println("查询全部角色"+list);
         try {
			req.getRequestDispatcher("../hr/page/power/user_add.jsp").forward(req,resp);//内部跳转
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
