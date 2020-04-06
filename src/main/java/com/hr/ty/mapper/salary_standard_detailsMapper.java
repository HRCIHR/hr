package com.hr.ty.mapper;

import org.springframework.stereotype.Repository;

import com.hr.entity.SalaryGrantDetails;
import com.hr.entity.SalaryStandardDetails;
@Repository
public interface salary_standard_detailsMapper {
    Integer insert(SalaryStandardDetails record);

}