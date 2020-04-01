package com.hr.zh.service;

import java.util.List;

import com.hr.entity.EngageMajorRelease;
import com.hr.util.pagination;

public interface MajorReleaseService {

	List<EngageMajorRelease> pageQueryMajorRelease(pagination page);

	Integer pageQueryMajorReleaseCount();

	Boolean saveMajorRelease(EngageMajorRelease MajorRelease);

	Boolean updateMajorRelease(EngageMajorRelease MajorRelease);

	Boolean delMajorRelease(Integer MajorReleaseID);

	List<EngageMajorRelease> QueryMajorReleaseByMojarKindid(Integer MojarKindid);

	EngageMajorRelease QueryMajorReleaseByMreid(Integer mreid);
}
