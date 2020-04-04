package com.hr.zh.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.EngageInterview;
import com.hr.entity.EngageResume;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.InterviewMapper;
import com.hr.zh.mapper.ResumeMapper;
import com.hr.zh.service.InterviewService;

@Service
//
@Transactional(isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
public class InterviewServiceImp implements InterviewService {

	@Autowired
	private InterviewMapper interviewMapper;

	@Autowired
	private ResumeMapper resumeMapper;

	@Override
	public boolean saveInterview(EngageInterview Interview) {
		// TODO Auto-generated method stub
		Integer saveInterview = interviewMapper.saveInterview(Interview);
		EngageResume resume = new EngageResume();
		resume.setInterview_Status(1);
		resume.setRes_Id((int) Interview.getResumeId());
		String sql = MasterTool.updatesqlFormat(resume);
		resumeMapper.updateResume(resume, sql);
		boolean success = MasterTool.isSuccess(saveInterview);
		return success;
	}

	@Override
	public List<EngageInterview> queryInterview(pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);

		List<EngageInterview> queryInterview = interviewMapper.queryInterview(page);
		return queryInterview;
	}

	@Override
	public Integer queryInterviewCount() {
		// TODO Auto-generated method stub

		return interviewMapper.queryInterviewCount();
	}

	@Override
	public boolean updateInterview(EngageInterview Interview) {
		// TODO Auto-generated method stub
		Integer updateInterview = interviewMapper.updateInterview(Interview);
		boolean success = MasterTool.isSuccess(updateInterview);
		return success;
	}

	@Override
	public List<EngageInterview> queryInterviewByStatusOne(pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		List<EngageInterview> queryInterviewByStatusOne = interviewMapper.queryInterviewByStatusOne(page);

		return queryInterviewByStatusOne;
	}

	@Override
	public Integer queryInterviewByStatusOneCount() {
		// TODO Auto-generated method stub
		Integer queryInterviewByStatusOneCount = interviewMapper.queryInterviewByStatusOneCount();
		return queryInterviewByStatusOneCount;
	}

}
