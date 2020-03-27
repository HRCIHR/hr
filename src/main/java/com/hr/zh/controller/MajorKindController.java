package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigMajorKind;
import com.hr.util.pagination;
import com.hr.zh.service.MajorKindService;

@Controller
@RequestMapping("MajorKind")
public class MajorKindController {

	@Resource(name = "MajorKindServiceImp")
	private MajorKindService majorKindService;
	@RequestMapping("pagQueryMajor")  //MajorKind/pagQueryMajor
	public @ResponseBody Map<String, Object> pagQueryMajor(pagination page) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigMajorKind> pagQueryMajor = majorKindService.pagQueryMajor(page);
		Integer count = majorKindService.pagQueryMajorCount();

		map.put("rows", pagQueryMajor);
		map.put("total", count);
		return map;
	}

}
