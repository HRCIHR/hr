package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.EngageResume;
import com.hr.util.ResumeCase;
import com.hr.util.pagination;
import com.hr.zh.service.ResumeService;

@Controller
@RequestMapping("Resume")
public class ResumeController {

	@Autowired
	private ResumeService resumeService;

	@RequestMapping("/saveResume") // Resume/saveResume
	public @ResponseBody Boolean saveResume(EngageResume Resume) {
		System.out.println(Resume);
		Boolean saveResume = resumeService.saveResume(Resume);
		return saveResume;
	}

	@RequestMapping("/updateResume") // Resume/updateResume
	public @ResponseBody Boolean updateResume(EngageResume Resume) {

		System.out.println("修改的数据======>" + Resume);
		Boolean updateResume = resumeService.updateResume(Resume);
		return updateResume;
	}

	@RequestMapping("/queryResumeByCase") // Resume/queryResumeByCase
	public @ResponseBody HashMap<String, Object> queryResumeByCase(ResumeCase resumeCase, pagination page) {
		// TODO Auto-generated method stub
		System.out.println(resumeCase);
		List<EngageResume> queryResumeByCase = resumeService.queryResumeByCase(resumeCase, page);

		HashMap<String, Object> map = new HashMap<String, Object>();
		Integer count = resumeService.queryResumeByCaseCount(resumeCase);
		map.put("rows", queryResumeByCase);
		map.put("total", count);

		return map;
	}
}
