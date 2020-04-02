package com.hr.ty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.SalaryStandard;
@Repository
public interface SalaryStandarService {
	List<SalaryStandard> selectBycheckStatus();//查询未复核状态的酬薪登记
}
