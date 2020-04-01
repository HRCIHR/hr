package com.hr.zh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.EngageMajorRelease;
import com.hr.util.pagination;

@Repository("MajorReleaseMapper")
public interface MajorReleaseMapper {

	List<EngageMajorRelease> pageQueryMajorRelease(pagination page);

	@Deprecated
	List<EngageMajorRelease> QueryMajorReleaseByMojarKindid(Integer MojarKindid);

	Integer pageQueryMajorReleaseCount();

	Integer saveMajorRelease(EngageMajorRelease MajorRelease);

	Integer updateMajorRelease(EngageMajorRelease MajorRelease);

	Integer delMajorRelease(Integer MajorReleaseID);

	EngageMajorRelease QueryMajorReleaseByMreid(Integer mreid);

}
