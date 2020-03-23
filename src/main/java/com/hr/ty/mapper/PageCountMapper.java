package com.hr.ty.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PageCountMapper {
	public Integer getTableCount(@Param("tabName")String tableName,@Param("tabId")String id); 
}
