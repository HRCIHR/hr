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

	@RequestMapping("/saveFirstKind") // First/saveFirstKind
	public @ResponseBody boolean saveFirstKind(ConfigFileFirstKind firstKind) {
		Boolean f = firstKindService.saveFirstKind(firstKind);
		System.out.println(firstKind);

		return f;

	}

	// updateFirstKind 名称不应许更改
	@RequestMapping("/updateFirstKind") // First/saveFirstKind
	public @ResponseBody boolean updateFirstKind(ConfigFileFirstKind firstKind) {

		boolean f = firstKindService.updateFirstKind(firstKind);
		System.out.println(firstKind);
		return f;

	}

	@RequestMapping("/delFirstKind") // First/saveFirstKind
	public @ResponseBody boolean delFirstKind(Integer firstKindID) {

		boolean f = firstKindService.DelFirstKindById(firstKindID);
		System.out.println(firstKindID);
		return f;

	}

	@RequestMapping("/findFirstKindAll") // First/findFirstKindAll
	public @ResponseBody List<ConfigFileFirstKind> findFirstKindAll() {

		List<ConfigFileFirstKind> findFirstKindAll = firstKindService.findFirstKindAll();
			System.out.println(findFirstKindAll);
		return findFirstKindAll;

	}
}
