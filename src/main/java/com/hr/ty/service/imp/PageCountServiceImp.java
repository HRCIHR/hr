package com.hr.ty.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.ty.mapper.PageCountMapper;
import com.hr.ty.service.PageCountService;

@Service
public class PageCountServiceImp implements PageCountService {
	@Autowired
	private PageCountMapper pt;

	@Override
	public Integer getTableCount(String tableName, String id) {
		// TODO Auto-generated method stub
		return pt.getTableCount(tableName, id);
	}

}
