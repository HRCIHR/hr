package com.hr.zh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.EngageInterview;
import com.hr.util.pagination;

public interface InterviewService {

	public boolean saveInterview(EngageInterview Interview);

	public boolean updateInterview(EngageInterview Interview);

	List<EngageInterview> queryInterview(pagination page);

	Integer queryInterviewCount();
	
	
	List<EngageInterview> queryInterviewByStatusOne(pagination page);

	Integer queryInterviewByStatusOneCount();
	
	List<EngageInterview> queryInterviewByStatus4(pagination page);

	Integer queryInterviewByStatus4Count();
	
	List<EngageInterview> queryInterviewByStatus5(pagination page);

	Integer queryInterviewByStatus5Count();
}
