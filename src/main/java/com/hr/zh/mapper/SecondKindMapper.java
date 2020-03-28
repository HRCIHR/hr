package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.pagination;

@Repository("SecondKindMapper")
public interface SecondKindMapper {

	List<ConfigFileSecondKind> pagQuerySecondKind(pagination page);

	Integer QuerySecondKindCount();

	ConfigFileSecondKind querySecondKindById(Integer secondKindId);

	List<ConfigFileSecondKind> querySecondKindByFirstId(Integer firstKindId);
	
	Integer saveSecondKind(ConfigFileSecondKind secondKind);

	Integer updateSecondKind(ConfigFileSecondKind secondKind);

	Integer delSecondKind(Integer secondKindID);
}
