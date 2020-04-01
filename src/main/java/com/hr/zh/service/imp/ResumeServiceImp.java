package com.hr.zh.service.imp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.EngageResume;
import com.hr.util.MasterTool;
import com.hr.util.ResumeCase;
import com.hr.util.pagination;
import com.hr.zh.mapper.ResumeMapper;
import com.hr.zh.service.ResumeService;

@Service
public class ResumeServiceImp implements ResumeService {

	@Autowired
	private ResumeMapper resumeMapper;

	@Override
	public Boolean saveResume(EngageResume Resume) {
		// TODO Auto-generated method stub
		// 字段多 遍历 自己搞sql语句
		String sqlFormat = MasterTool.sqlFormat(Resume);
//		System.out.println("sql语句:" + sqlFormat);
		Integer saveResume = resumeMapper.saveResume(Resume, sqlFormat);
		boolean success = MasterTool.isSuccess(saveResume);
		return success;
	}

	@Override
	public List<EngageResume> queryResumeByCase(ResumeCase resumeCase, pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		List<EngageResume> queryResumeByCase = resumeMapper.queryResumeByCase(resumeCase, page);
		return queryResumeByCase;
	}

	@Override
	public Integer queryResumeByCaseCount(ResumeCase resumeCase) {
		// TODO Auto-generated method stub
		Integer queryResumeByCaseCount = resumeMapper.queryResumeByCaseCount(resumeCase);

		return queryResumeByCaseCount;
	}

	@Override
	public Boolean updateResume(EngageResume Resume) {
		// TODO Auto-generated method stub

		String sqlFormat = MasterTool.updatesqlFormat(Resume);
//		System.out.println("sql语句:" + sqlFormat);
		Integer updatecount = resumeMapper.updateResume(Resume, sqlFormat);
		boolean success = MasterTool.isSuccess(updatecount);
		return success;

	}
}
