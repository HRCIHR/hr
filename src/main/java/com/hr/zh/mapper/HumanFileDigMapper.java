package com.hr.zh.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.HumanFile;

@Repository
public interface HumanFileDigMapper {
	
	Integer saveHumanFileDig(@Param("sql") String value, @Param("humanFile") HumanFile humanFile);
	
}
