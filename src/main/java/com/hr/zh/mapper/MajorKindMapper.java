package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigMajorKind;
import com.hr.util.pagination;

@Repository("MajorKindMapper")
public interface MajorKindMapper {

	List<ConfigMajorKind> pagQueryMajor(pagination page);

	Integer pagQueryMajorCount();

	ConfigMajorKind QueryMajorById(Integer majorkindId);

}
