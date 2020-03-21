package com.hr.ty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_right;

@Repository
public interface sys_rightService {
	List<sys_right> queryRight();

	List<sys_right> queryRightByParentId(Integer id);
}
