package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigMajor;
import com.hr.util.pagination;

@Repository("MajorMapper")
public interface MajorMapper {
	List<ConfigMajor> pagQueryMajor(pagination page);

	List<ConfigMajor> QueryMajor(Integer majorKindId);

	Integer queryMajorCount();

	Integer saveMajor(ConfigMajor Major);

	Integer delMajor(Integer Majorid);

	ConfigMajor queryMajorByid(Integer Majorid);
}
