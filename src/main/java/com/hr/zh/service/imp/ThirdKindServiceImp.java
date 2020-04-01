package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.ThirdKindMapper;
import com.hr.zh.service.ThirdKindService;
import com.mysql.jdbc.Util;

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

	@Override
	public boolean saveThirdKind(ConfigFileThirdKind thirdKind) {
		// TODO Auto-generated method stub
		Integer saveThirdKind = thirdKindMapper.saveThirdKind(thirdKind);
		boolean success = MasterTool.isSuccess(saveThirdKind);
		return success;
	}

	@Override
	public boolean updateThirdKind(ConfigFileThirdKind thirdKind) {
		// TODO Auto-generated method stub
		Integer updateThirdKind = thirdKindMapper.updateThirdKind(thirdKind);
		boolean success = MasterTool.isSuccess(updateThirdKind);
		return success;
	}

	@Override
	public boolean delThirdKind(Integer thirdKindID) {
		// TODO Auto-generated method stub
		Integer delThirdKind = thirdKindMapper.delThirdKind(thirdKindID);
		boolean success = MasterTool.isSuccess(delThirdKind);
		return success;
	}

	@Override
	public List<ConfigFileThirdKind> queryThirdKindByIDList(Integer secondKindId) {
		// TODO Auto-generated method stub
		List<ConfigFileThirdKind> queryThirdKindByIDList = thirdKindMapper.queryThirdKindByIDList(secondKindId);
		return queryThirdKindByIDList;
	}

}
