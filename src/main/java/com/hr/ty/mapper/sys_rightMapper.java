package com.hr.ty.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_right;

@Repository
public interface sys_rightMapper {
	List<sys_right> queryRight();

	List<sys_right> queryRightByParentId(Integer id);
	
	List<sys_right> queryRightAndRoleByRoleId(Integer roleId);
}