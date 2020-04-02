package com.hr.ty.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.SalaryStandard;
@Repository
public interface salary_standardMapper {
	List<SalaryStandard> selectBycheckStatus();//查询未复核状态的酬薪登记
}