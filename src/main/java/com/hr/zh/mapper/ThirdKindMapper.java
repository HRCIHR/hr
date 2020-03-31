package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.pagination;

@Repository("ThirdKindMapper")
public interface ThirdKindMapper {

	List<ConfigFileThirdKind> pagQueryThirdKind(pagination page);

	List<ConfigFileThirdKind> queryThirdKindByIDList(Integer secondKindId);

	Integer QueryThirdKindCount();

	ConfigFileThirdKind queryThirdKindById(Integer thirdKindID);

	Integer saveThirdKind(ConfigFileThirdKind thirdKind);

	Integer updateThirdKind(ConfigFileThirdKind thirdKind);

	Integer delThirdKind(Integer thirdKindID);

}
