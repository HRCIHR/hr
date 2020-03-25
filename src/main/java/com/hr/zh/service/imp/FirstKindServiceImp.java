package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.util.pagination;
import com.hr.zh.mapper.FirstKindMapper;
import com.hr.zh.service.FirstKindService;

@Service("FirstKindServiceImp")
public class FirstKindServiceImp implements FirstKindService {

	@Resource(name = "FirstKindMapper")
	private FirstKindMapper firstKindMapper;

	@Override
	public List<ConfigFileFirstKind> queryfirstKindAll(pagination page) {
		// TODO Auto-generated method stub
		System.out.println(page + "==============");
		int pages = page.getPage();
		page.setPage((pages - 1) * page.getRows());

		return firstKindMapper.queryfirstKindAll(page);
	}

	@Override
	public Integer queryfirstKindAllCount() {
		// TODO Auto-generated method stub
		return firstKindMapper.queryfirstKindAllCount();
	}

}
