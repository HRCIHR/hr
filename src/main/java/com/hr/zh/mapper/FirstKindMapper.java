package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.util.pagination;

@Repository("FirstKindMapper")
public interface FirstKindMapper {

	List<ConfigFileFirstKind> queryfirstKindAll(pagination page);

	Integer queryfirstKindAllCount();

	ConfigFileFirstKind queryfirstKindById(Integer firstKind);

	Integer saveFirstKind(ConfigFileFirstKind firstKind);

	Integer updateFirstKind(ConfigFileFirstKind firstKind);

	Integer DelFirstKindById(Integer firstKindid);
	
	
	//findFirstKindAll
	List<ConfigFileFirstKind> findFirstKindAll();
	

}
