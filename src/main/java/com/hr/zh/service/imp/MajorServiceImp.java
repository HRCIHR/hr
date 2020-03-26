package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigMajor;
import com.hr.util.pagination;
import com.hr.zh.mapper.MajorMapper;
import com.hr.zh.service.MajorService;

@Service("MajorServiceImp")
public class MajorServiceImp implements MajorService {

	@Resource(name = "MajorMapper")
	private MajorMapper majorMapper;

	@Override
	public List<ConfigMajor> pagQueryMajor(pagination page) {
		// TODO Auto-generated method stub
		System.out.println(page + "==============");
		int pages = page.getPage();
		page.setPage((pages - 1) * page.getRows());
		return majorMapper.pagQueryMajor(page);
	}

	@Override
	public Integer queryMajorCount() {
		// TODO Auto-generated method stub

		return majorMapper.queryMajorCount();
	}

}
