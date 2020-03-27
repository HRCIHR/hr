package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.pagination;
import com.hr.zh.mapper.ThirdKindMapper;
import com.hr.zh.service.ThirdKindService;

@Service("ThirdKindServiceImp")
public class ThirdKindServiceImp implements ThirdKindService {

	@Resource(name = "ThirdKindMapper")
	private ThirdKindMapper thirdKindMapper;

	@Override
	public List<ConfigFileThirdKind> pagQueryThirdKind(pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		return thirdKindMapper.pagQueryThirdKind(page);
	}

	@Override
	public Integer queryThirdKindcount() {
		// TODO Auto-generated method stub
		return thirdKindMapper.QueryThirdKindCount();
	}

}
