package com.hr.zh.mapper;

import java.util.List;

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

	Integer queryInterviewCount();

}
