package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.pagination;

public interface SecondKindService {
	List<ConfigFileSecondKind> pagQuerySecondKind(pagination page);
	Integer QuerySecondKindCount();
}
