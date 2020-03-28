package com.hr.zh.service;

import java.util.List;

import com.hr.entity.ConfigPublicChar;
import com.hr.util.pagination;

public interface PublicCharService {

	List<ConfigPublicChar> pagQueryPublicChar(pagination page);

	Integer queryPublicCharCount();

	Integer queryPublicCharByTypeCount();

	List<ConfigPublicChar> pagQueryPublicCharByType(pagination page, String type);
	

	boolean savePublicChar(ConfigPublicChar PublicChar);

	boolean delPublicChar(Integer PublicCharID);
}
