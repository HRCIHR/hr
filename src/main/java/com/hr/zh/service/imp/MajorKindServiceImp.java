package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigMajorKind;
import com.hr.util.pagination;
import com.hr.zh.mapper.MajorKindMapper;
import com.hr.zh.service.MajorKindService;

@Service("MajorKindServiceImp")
public class MajorKindServiceImp implements MajorKindService {

	@Resource(name = "MajorKindMapper")
	private MajorKindMapper majorKindMapper;
	@Override
	public List<ConfigMajorKind> pagQueryMajor(pagination page) {
		// TODO Auto-generated method stub
		
		pagination.pageformat(page);
		return majorKindMapper.pagQueryMajor(page);
	}

	@Override
	public Integer pagQueryMajorCount() {
		// TODO Auto-generated method stub
		return majorKindMapper.pagQueryMajorCount();
	}

}
