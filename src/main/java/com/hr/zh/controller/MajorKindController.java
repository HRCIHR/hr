package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.ConfigPublicChar;
import com.hr.util.pagination;
import com.hr.zh.service.MajorKindService;

@Controller
@RequestMapping("MajorKind")
public class MajorKindController {

	@Resource(name = "MajorKindServiceImp")
	private MajorKindService majorKindService;

	@RequestMapping("pagQueryMajor") // MajorKind/pagQueryMajor
	public @ResponseBody Map<String, Object> pagQueryMajor(pagination page) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigMajorKind> pagQueryMajor = majorKindService.pagQueryMajor(page);
		Integer count = majorKindService.pagQueryMajorCount();

		map.put("rows", pagQueryMajor);
		map.put("total", count);
		return map;
	}

	// MajorKind/saveMajorKind
	@RequestMapping("/saveMajorKind")
	public @ResponseBody boolean saveMajorKind(ConfigMajorKind MajorKind) {
		System.out.println(MajorKind);
		Boolean success = majorKindService.saveMajorKind(MajorKind);
		return success;
	}

	// MajorKind/delMajorKind
	@RequestMapping("/delMajorKind")
	public @ResponseBody boolean delMajorKind(Integer MajorKind) {
		Boolean success = majorKindService.delMajorKind(MajorKind);
		System.out.println(MajorKind);
		return success;
	}

	@RequestMapping("/queryMajorKind") // MajorKind/queryMajorKind
	public @ResponseBody List<ConfigMajorKind> queryMajorKind() {
		
		return majorKindService.queryMajorKind();
	}

}
