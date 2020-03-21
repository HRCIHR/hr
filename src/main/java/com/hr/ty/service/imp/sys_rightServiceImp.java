package com.hr.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.sys_right;
import com.hr.ty.mapper.sys_rightMapper;
import com.hr.ty.service.sys_rightService;

@Service
public class sys_rightServiceImp implements sys_rightService {
	@Autowired
	private sys_rightMapper srm;

	@Override
	public List<sys_right> queryRight() {
		// TODO Auto-generated method stub
		System.out.println("sys_rightServiceImp");
		return srm.queryRight();
	}

	@Override
	public List<sys_right> queryRightByParentId(Integer id) {
		// TODO Auto-generated method stub
		if(id==null) {
			id=0;
		}
		System.out.println("queryRightByParentId");
		return srm.queryRightByParentId(id);
	}

}
