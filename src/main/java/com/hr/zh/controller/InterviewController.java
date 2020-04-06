package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.EngageInterview;
import com.hr.util.pagination;
import com.hr.zh.service.InterviewService;

@Controller
@RequestMapping("Interview")
public class InterviewController {

	@Autowired
	private InterviewService interviewService;

	@RequestMapping("/saveInterview") // Interview/saveInterview
	public @ResponseBody boolean saveInterview(EngageInterview Interview) {

		System.out.println("测试数据=====>" + Interview);
		boolean saveInterview = interviewService.saveInterview(Interview);
		return saveInterview;

	}

	@RequestMapping("/updateInterview") // Interview/updateInterview 面试结果
	public @ResponseBody boolean updateInterview(EngageInterview Interview) {

		System.out.println("测试数据=====>" + Interview);
		boolean updateInterview = interviewService.updateInterview(Interview);

		return false;

	}

	@RequestMapping("/queryInterview") // Interview/queryInterview
	public @ResponseBody HashMap<String, Object> queryInterview(pagination page) {
		// TODO Auto-generated method stub
		List<EngageInterview> queryInterview = interviewService.queryInterview(page);
		for (EngageInterview engageInterview : queryInterview) {
			System.out.println(engageInterview);
			System.out.println("======================");
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("rows", queryInterview);
		map.put("total", interviewService.queryInterviewCount());
		return map;
	}

	@RequestMapping("/queryInterviewByStatusOne") // Interview/queryInterview
	public @ResponseBody HashMap<String, Object> queryInterviewByStatusOne(pagination page) {
		List<EngageInterview> queryInterviewByStatusOne = interviewService.queryInterviewByStatusOne(page);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("rows", queryInterviewByStatusOne);
		map.put("total", interviewService.queryInterviewByStatusOneCount());
		return map;
	}

	@RequestMapping("/queryInterviewByStatus4") // Interview/queryInterviewByStatus4
	public @ResponseBody HashMap<String, Object> queryInterviewByStatus4(pagination page) {
		List<EngageInterview> queryInterviewByStatus4 = interviewService.queryInterviewByStatus4(page);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("rows", queryInterviewByStatus4);
		map.put("total", interviewService.queryInterviewByStatus4Count());
		return map;
	}

	@RequestMapping("/queryInterviewByStatus5") // Interview/queryInterviewByStatus5
	public @ResponseBody HashMap<String, Object> queryInterviewByStatus5(pagination page) {
		List<EngageInterview> queryInterviewByStatus5 = interviewService.queryInterviewByStatus5(page);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("rows", queryInterviewByStatus5);
		map.put("total", interviewService.queryInterviewByStatus5Count());
		return map;
	}
//	@RequestMapping("/updateInterViewApply") // Interview/updateInterViewApply
//	public Boolean updateInterViewApply(String comment, Integer checkStatus, Integer einId, Integer resid) {
//		System.out.println(comment + checkStatus);
//		
//		return false;
//	}

}
