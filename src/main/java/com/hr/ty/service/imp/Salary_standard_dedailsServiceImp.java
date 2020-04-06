package com.hr.ty.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.SalaryGrantDetails;
import com.hr.entity.SalaryStandardDetails;
import com.hr.ty.mapper.salary_standard_detailsMapper;
import com.hr.ty.service.Salary_standard_dedailsService;
@Service
public class Salary_standard_dedailsServiceImp implements Salary_standard_dedailsService {
	@Autowired
    private salary_standard_detailsMapper sm;
	@Override
	@Transactional
	public Integer insert(SalaryStandardDetails record) {
		// TODO Auto-generated method stub
		System.out.println("Salary_standard_dedailsServiceImp"+record);
		return sm.insert(record);
	}

}
