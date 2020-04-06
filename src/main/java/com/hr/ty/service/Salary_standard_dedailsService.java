package com.hr.ty.service;

import org.springframework.stereotype.Repository;

import com.hr.entity.SalaryGrantDetails;
import com.hr.entity.SalaryStandardDetails;
@Repository
public interface Salary_standard_dedailsService {
	Integer insert(SalaryStandardDetails record);
}
