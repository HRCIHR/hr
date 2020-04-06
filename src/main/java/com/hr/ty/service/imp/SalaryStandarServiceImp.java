package com.hr.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.SalaryStandard;
import com.hr.ty.mapper.salary_standardMapper;
import com.hr.ty.service.SalaryStandarService;
import com.hr.util.pagination;
@Service
public class SalaryStandarServiceImp implements SalaryStandarService{
	@Autowired
	private salary_standardMapper ss;

	@Override
	public List<SalaryStandard> selectBycheckStatus(pagination page) {
		// TODO Auto-generated method stub
		 
		return ss.selectBycheckStatus(page);
	}

	@Override
	public Integer getTableCountByStandardId(String tableName, String id) {
		// TODO Auto-generated method stub
		return ss.getTableCountByStandardId(tableName, id);
	}

	@Override
	@Transactional
	public Integer insertSalaryStandard(SalaryStandard standard) {
		// TODO Auto-generated method stub
		return ss.insertSalaryStandard(standard);
	}

	@Override
	public List<SalaryStandard> selectSalaryStandard(pagination page) {
		// TODO Auto-generated method stub
		return ss.selectSalaryStandard(page);
	}

	@Override
	public Integer getTableCountByStandard(String tableName, String id) {
		// TODO Auto-generated method stub
		return ss.getTableCountByStandard(tableName, id);
	}

}
