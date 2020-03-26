package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.pagination;

@Repository("ThirdKindMapper")
public interface ThirdKindMapper {

	List<ConfigFileThirdKind> pagQueryThirdKind(pagination page);
	
	
	Integer QueryThirdKindCount();
}
