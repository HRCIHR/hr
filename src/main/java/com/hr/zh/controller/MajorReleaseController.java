package com.hr.zh.controller;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.EngageMajorRelease;
import com.hr.util.pagination;
import com.hr.zh.service.MajorReleaseService;

@Controller
@RequestMapping("MajorRelease")
public class MajorReleaseController {

	@Resource(name = "MajorReleaseServiceImp")
	private MajorReleaseService majorReleaseService;

	@RequestMapping("/pageQueryMajorRelease") // MajorRelease/pageQueryMajorRelease
	public @ResponseBody Map pageQueryMajorRelease(pagination page) {
		List<EngageMajorRelease> pageQueryMajorRelease = majorReleaseService.pageQueryMajorRelease(page);
		System.out.println(pageQueryMajorRelease);

		for (EngageMajorRelease engageMajorRelease : pageQueryMajorRelease) {
			System.out.println("数据条数:" + engageMajorRelease);
		}
		Integer pageQueryMajorReleaseCount = majorReleaseService.pageQueryMajorReleaseCount();
		System.out.println(pageQueryMajorReleaseCount);
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println(pageQueryMajorRelease.size());
		map.put("rows", pageQueryMajorRelease);
		map.put("total", pageQueryMajorReleaseCount);

		return map;
	}

	@RequestMapping("/saveMajorRelease") // MajorRelease/saveMajorRelease
	public @ResponseBody Boolean saveMajorRelease(EngageMajorRelease MajorRelease) {

		Boolean saveMajorRelease = majorReleaseService.saveMajorRelease(MajorRelease);
		System.out.println(MajorRelease);
		return saveMajorRelease;

	}

	@RequestMapping("/updateMajorRelease") // MajorRelease/updateMajorRelease
	public @ResponseBody Boolean updateMajorRelease(EngageMajorRelease MajorRelease) {

		Boolean updateMajorRelease = majorReleaseService.updateMajorRelease(MajorRelease);
		System.out.println(MajorRelease);
		return updateMajorRelease;

	}

	@RequestMapping("/delMajorRelease") // MajorRelease/delMajorRelease?MajorReleaseID
	public @ResponseBody Boolean delMajorRelease(Integer MajorReleaseID) {
		Boolean delMajorRelease = majorReleaseService.delMajorRelease(MajorReleaseID);
		System.out.println(MajorReleaseID);

		return delMajorRelease;
	}

	@Deprecated
	@RequestMapping("/QueryMajorReleaseByMojarKindid") // MajorRelease/QueryMajorReleaseByMojarKindid?MojarKindid
	public @ResponseBody List<EngageMajorRelease> QueryMajorReleaseByMojarKindid(Integer MojarKindid) {
		// TODO Auto-generated method stub
		List<EngageMajorRelease> queryMajorReleaseByMojarKindid = majorReleaseService
				.QueryMajorReleaseByMojarKindid(MojarKindid);
		return queryMajorReleaseByMojarKindid;
	}

	@RequestMapping("/QueryMajorReleaseByMreid") // MajorRelease/QueryMajorReleaseByMreid?mreid
	public @ResponseBody EngageMajorRelease QueryMajorReleaseByMreid(Integer mreid) {

		EngageMajorRelease queryMajorReleaseByMreid = majorReleaseService.QueryMajorReleaseByMreid(mreid);
		return queryMajorReleaseByMreid;
	}

}
