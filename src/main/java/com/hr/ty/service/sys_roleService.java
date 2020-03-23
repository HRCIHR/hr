package com.hr.ty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_role;

@Repository
public interface sys_roleService {
	public List<sys_role> queryRole();
}
