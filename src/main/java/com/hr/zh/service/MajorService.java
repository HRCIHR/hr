package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigMajor;
import com.hr.util.pagination;

public interface MajorService {
	List<ConfigMajor> pagQueryMajor(pagination page);

	Integer queryMajorCount();
}
