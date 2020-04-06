package com.hr.ty.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.SalaryStandard;
import com.hr.util.pagination;
@Repository
public interface SalaryStandarService {
	List<SalaryStandard> selectBycheckStatus(pagination page);//查询未复核状态的酬薪登记
	
	Integer getTableCountByStandardId(@Param("tabName") String tableName, @Param("tabId") String id);
	
	Integer insertSalaryStandard(SalaryStandard standard);
	
	List<SalaryStandard>selectSalaryStandard(pagination page);//查询所有
	
	Integer getTableCountByStandard(@Param("tabName") String tableName, @Param("tabId") String id);
}
