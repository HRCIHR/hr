package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.util.pagination;

public interface FirstKindService {
	List<ConfigFileFirstKind> queryfirstKindAll(pagination page);

	Integer queryfirstKindAllCount();

	Boolean saveFirstKind(ConfigFileFirstKind firstKind);

	Boolean updateFirstKind(ConfigFileFirstKind firstKind);

	Boolean DelFirstKindById(Integer firstKindid);

	List<ConfigFileFirstKind> findFirstKindAll();
}
