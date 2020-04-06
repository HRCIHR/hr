package com.hr.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.EngageInterview;
import com.hr.util.pagination;

@Repository
public interface InterviewMapper {

	public Integer saveInterview(EngageInterview Interview);

	public Integer updateInterview(EngageInterview Interview);

	List<EngageInterview> queryInterview(pagination page);

	List<EngageInterview> queryInterviewByStatusOne(pagination page);

	Integer queryInterviewByStatusOneCount();

	List<EngageInterview> queryInterviewByStatus4(pagination page);

	Integer queryInterviewByStatus4Count();

	List<EngageInterview> queryInterviewByStatus5(pagination page);

	Integer queryInterviewByStatus5Count();

	Integer queryInterviewCount();

	// 录用申请已经和状态修改
	Integer updateInterViewStatuszero(EngageInterview Interview);

}
