package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.pagination;

public interface SecondKindService {
	List<ConfigFileSecondKind> pagQuerySecondKind(pagination page);

	Integer QuerySecondKindCount();

	Boolean saveSecondKind(ConfigFileSecondKind secondKind);

	Boolean updateSecondKind(ConfigFileSecondKind secondKind);

	Boolean delSecondKind(Integer secondKindID);

	List<ConfigFileSecondKind> querySecondKindByFirstId(Integer firstKindId);
}
