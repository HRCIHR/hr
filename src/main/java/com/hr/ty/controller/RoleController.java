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
	@ResponseBody
	public List queryRoleJson() {
		List<sys_role> list = ss.queryRole();
		System.out.println("查询全部角色" + list);
		return list;

	}

	@RequestMapping("/insertRole")
	@ResponseBody
	public Integer insertRole(sys_role role) {
		System.out.println("添加角色:" + role);
		return ss.insertRole(role);
	}
	
	@RequestMapping("/queryRoleAndRightByRoleId")
	@ResponseBody
	public sys_role queryRoleAndRightByRoleId(sys_role role) {
		System.out.println("查询角色和权限根据角色Id:"+role);
		sys_role sys_role = ss.queryRoleAndRightByRoleId(role);
		return sys_role;
	}
	//删除角色
		@RequestMapping("/deleteRoleById")                      
		@ResponseBody
		public Integer deleteRoleById(sys_role role) {
			System.out.println("删除:"+role);
			Integer num=ss.deleteRoleById(role);
			return num;
	}
		//修改角色和权限
		@RequestMapping("/updateRoleAndRoleRight")
		@ResponseBody
		public Integer updateRoleAndRoleRight(sys_role role,Integer[] arr) {
			System.out.println("修改角色1:"+role);
			System.out.println(arr+"/"+arr.length);
			Integer num=ss.updateRole(role, arr);
			return num;
		}
		//删除角色所有权限
				@RequestMapping("/deleteRoleRight")                    
				@ResponseBody
				public Integer deleteRoleRight(sys_role role) {
					System.out.println("删除:"+role);
					Integer num=ss.deleteRoleRightByRoleId(role);
					return num;
			}
}
