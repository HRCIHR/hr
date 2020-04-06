package com.hr.zh.service;

import java.util.List;

import com.hr.entity.EngageInterview;
import com.hr.entity.EngageResume;
import com.hr.util.ResumeCase;
import com.hr.util.pagination;

public interface ResumeService {

	public Boolean saveResume(EngageResume Resume);
	
	
	public Boolean updateResume(EngageResume Resume);
	List<EngageResume> queryResumeByCase(ResumeCase resumeCase,pagination page);
	
	Integer queryResumeByCaseCount(ResumeCase ResumeCase);
	
	Boolean updateResumeApply(EngageResume resume,EngageInterview interview);
	
	Boolean updateResumeApplytwo(EngageResume resume,EngageInterview interview);

}
