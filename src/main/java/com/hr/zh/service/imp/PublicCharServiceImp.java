package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigPublicChar;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.PublicCharMapper;
import com.hr.zh.service.PublicCharService;

@Service("PublicCharServiceImp")
public class PublicCharServiceImp implements PublicCharService {

	@Resource(name = "PublicCharMapper")
	private PublicCharMapper publicCharMapper;

	@Override
	public List<ConfigPublicChar> pagQueryPublicChar(pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);

		return publicCharMapper.pagQueryPublicChar(page);
	}

	@Override
	public Integer queryPublicCharCount() {
		// TODO Auto-generated method stub
		return publicCharMapper.queryPublicCharCount();
	}

	@Override
	public List<ConfigPublicChar> pagQueryPublicCharByType(pagination page, String type) {
		// TODO Auto-generated method stub
		System.out.println(page + "==============");
		int pages = page.getPage();
		page.setPage((pages - 1) * page.getRows());

		return publicCharMapper.pagQueryPublicCharByType(page, type);
	}

	@Override
	public Integer queryPublicCharByTypeCount(String type) {
		// TODO Auto-generated method stub
		return publicCharMapper.queryPublicCharByTypeCount(type);
	}

	@Override
	public boolean savePublicChar(ConfigPublicChar PublicChar) {
		// TODO Auto-generated method stub
		Integer savePublicChar = publicCharMapper.savePublicChar(PublicChar);
		boolean success = MasterTool.isSuccess(savePublicChar);
		return success;
	}

	@Override
	public boolean delPublicChar(Integer PublicCharID) {
		// TODO Auto-generated method stub
		Integer delPublicChar = publicCharMapper.delPublicChar(PublicCharID);
		boolean success = MasterTool.isSuccess(delPublicChar);
		return success;
	}

	@Override
	public List<ConfigPublicChar> queryPublicChar(String type) {
		// TODO Auto-generated method stub
		List<ConfigPublicChar> queryPublicChar = publicCharMapper.queryPublicChar(type);
		return queryPublicChar;
	}

}
