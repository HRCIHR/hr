package com.hr.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.ConfigPublicChar;
import com.hr.util.pagination;
import com.sun.org.glassfish.gmbal.ParameterNames;

@Repository("PublicCharMapper")
public interface PublicCharMapper {

	List<ConfigPublicChar> pagQueryPublicChar(pagination page);

	Integer queryPublicCharCount();

	Integer queryPublicCharByTypeCount();

	List<ConfigPublicChar> pagQueryPublicCharByType(@Param("pa") pagination page, @Param("type") String type);

}