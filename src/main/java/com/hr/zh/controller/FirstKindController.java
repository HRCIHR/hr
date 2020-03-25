package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.util.pagination;
import com.hr.zh.service.FirstKindService;
import com.sun.xml.internal.bind.v2.runtime.Name;

@Controller
@RequestMapping("First")
public class FirstKindController {

	@Resource(name = "FirstKindServiceImp")
	private FirstKindService firstKindService;

	@RequestMapping("/queryFirstKindAll")
	public @ResponseBody Map<String, Object> queryFirstKindAll(pagination page) {
		List<ConfigFileFirstKind> queryfirstKindAll = firstKindService.queryfirstKindAll(page);
		for (ConfigFileFirstKind configFileFirstKind : queryfirstKindAll) {
			System.out.println(configFileFirstKind);
		}
		Integer count = firstKindService.queryfirstKindAllCount();
		System.out.println("总数:" + count);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("rows", queryfirstKindAll);
		map.put("total", count);
		return map;

	}

}
