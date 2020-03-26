package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.util.pagination;
import com.hr.zh.service.ThirdKindService;

@Controller
@RequestMapping("Third")
public class ThirdKindController {

	@Resource(name = "ThirdKindServiceImp")
	private ThirdKindService thirdKindService;

	@RequestMapping("/pagQueryThirdKind")
	public @ResponseBody Map<String, Object> pagQueryThirdKind(pagination page) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigFileThirdKind> pagQueryThirdKind = thirdKindService.pagQueryThirdKind(page);
		System.out.println(pagQueryThirdKind);
		// 求总数
		Integer count = thirdKindService.queryThirdKindcount();
		map.put("rows", pagQueryThirdKind);
		map.put("total", count);

		return map;
	}
}
