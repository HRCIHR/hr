package com.hr.zh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.ConfigMajorKind;
import com.hr.util.pagination;

public interface MajorKindService {
	List<ConfigMajorKind> pagQueryMajor(pagination page);

	Integer pagQueryMajorCount();
}
