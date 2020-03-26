package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.pagination;
import com.hr.zh.mapper.SecondKindMapper;
import com.hr.zh.service.SecondKindService;

@Service("SecondKindServiceImp")
public class SecondKindServiceImp implements SecondKindService {

	@Resource(name = "SecondKindMapper")
	private SecondKindMapper secondKindMapper;

	@Override
	public List<ConfigFileSecondKind> pagQuerySecondKind(pagination page) {
		// TODO Auto-generated method stub
		System.out.println(page + "==============");
		int pages = page.getPage();
		page.setPage((pages - 1) * page.getRows());
		return secondKindMapper.pagQuerySecondKind(page);
	}

	@Override
	public Integer QuerySecondKindCount() {
		// TODO Auto-generated method stub
		return secondKindMapper.QuerySecondKindCount();
	}

}
