package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.SecondKindMapper;
import com.hr.zh.service.SecondKindService;

@Service("SecondKindServiceImp")
public class SecondKindServiceImp implements SecondKindService {

	@Resource(name = "SecondKindMapper")
	private SecondKindMapper secondKindMapper;

	@Override
	public List<ConfigFileSecondKind> pagQuerySecondKind(pagination page) {
		pagination.pageformat(page);
		return secondKindMapper.pagQuerySecondKind(page);
	}

	@Override
	public Integer QuerySecondKindCount() {
		// TODO Auto-generated method stub
		return secondKindMapper.QuerySecondKindCount();
	}

	@Override
	public Boolean saveSecondKind(ConfigFileSecondKind secondKind) {
		// TODO Auto-generated method stub
		Integer saveSecondKind = secondKindMapper.saveSecondKind(secondKind);
		boolean success = MasterTool.isSuccess(saveSecondKind);
		return success;
	}

	@Override
	public Boolean updateSecondKind(ConfigFileSecondKind secondKind) {
		// TODO Auto-generated method stub
		Integer updateSecondKind = secondKindMapper.updateSecondKind(secondKind);
		boolean success = MasterTool.isSuccess(updateSecondKind);
		return success;
	}

	@Override
	public Boolean delSecondKind(Integer secondKindID) {
		// TODO Auto-generated method stub
		Integer delSecondKind = secondKindMapper.delSecondKind(secondKindID);
		boolean success = MasterTool.isSuccess(delSecondKind);
		return success;
	}

	@Override
	public List<ConfigFileSecondKind> querySecondKindByFirstId(Integer firstKindId) {
		// TODO Auto-generated method stub
		List<ConfigFileSecondKind> querySecondKindByFirstId = secondKindMapper.querySecondKindByFirstId(firstKindId);
		
		return querySecondKindByFirstId;
	}

}
