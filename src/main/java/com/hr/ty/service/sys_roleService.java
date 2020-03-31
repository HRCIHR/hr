package com.hr.ty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_role;

@Repository
public interface sys_roleService {
	public List<sys_role> queryRole();

	public Integer insertRole(sys_role role);
	
	public sys_role queryRoleAndRightByRoleId(sys_role role);//新加的
	
	public Integer deleteRoleById(sys_role role);
	
	public Integer updateRole(sys_role role,Integer[] rightId);
	
	public Integer deleteRoleRightByRoleId(sys_role role);
	
	
}
