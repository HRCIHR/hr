package com.hr.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.sys_role;
import com.hr.ty.mapper.sys_roleMapper;
import com.hr.ty.service.sys_roleService;
@Service
public class sys_roleServiceImp implements sys_roleService {
@Autowired
private sys_roleMapper sm;
	@Override
	public List<sys_role> queryRole() {
		// TODO Auto-generated method stub
		return sm.queryRole();
	}

}
