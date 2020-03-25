package com.hr.ty.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PageCountService {
	public Integer getTableCount(@Param("tabName") String tableName, @Param("tabId") String id);
}
