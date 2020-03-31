package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigMajor;
import com.hr.util.pagination;

public interface MajorService {
	List<ConfigMajor> pagQueryMajor(pagination page);

	List<ConfigMajor> QueryMajor(Integer majorKindId);

	Integer queryMajorCount();

	Boolean saveMajor(ConfigMajor Major);

	Boolean delMajor(Integer Majorid);
}
