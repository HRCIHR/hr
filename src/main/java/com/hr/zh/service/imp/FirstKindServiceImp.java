package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.util.MasterTool;
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

		pagination.pageformat(page);

		return firstKindMapper.queryfirstKindAll(page);
	}

	@Override
	public Integer queryfirstKindAllCount() {
		// TODO Auto-generated method stub
		return firstKindMapper.queryfirstKindAllCount();
	}

	@Override
	public Boolean saveFirstKind(ConfigFileFirstKind firstKind) {
		// TODO Auto-generated method stub

		Integer saveFirstKind = firstKindMapper.saveFirstKind(firstKind);

		return MasterTool.isSuccess(saveFirstKind);
	}

	@Override
	public Boolean updateFirstKind(ConfigFileFirstKind firstKind) {
		// TODO Auto-generated method stub
		Integer updateFirstKind = firstKindMapper.updateFirstKind(firstKind);

		return MasterTool.isSuccess(updateFirstKind);
	}

	@Override
	public Boolean DelFirstKindById(Integer firstKindid) {
		// TODO Auto-generated method stub
		Integer s = firstKindMapper.DelFirstKindById(firstKindid);
		return MasterTool.isSuccess(s);
	}

	@Override
	public List<ConfigFileFirstKind> findFirstKindAll() {
		// TODO Auto-generated method stub

		return firstKindMapper.findFirstKindAll();
	}

}
