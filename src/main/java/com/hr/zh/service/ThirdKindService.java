package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.pagination;

public interface ThirdKindService {
List<ConfigFileThirdKind> pagQueryThirdKind(pagination page);
	
	
	Integer queryThirdKindcount();
}
