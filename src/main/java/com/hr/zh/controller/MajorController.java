package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigMajor;
import com.hr.util.pagination;
import com.hr.zh.service.MajorService;
import com.hr.zh.service.imp.MajorServiceImp;

@Controller
@RequestMapping("Major")
public class MajorController {
	@Resource(name = "MajorServiceImp")
	private MajorService majorService;

	@RequestMapping("/pagQueryMajor") // Major/pagQueryMajor
	public @ResponseBody HashMap<String, Object> pagQueryMajor(pagination page) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigMajor> pagQueryMajor = majorService.pagQueryMajor(page);
		Integer count = majorService.queryMajorCount();
		System.out.println("测试数据:" + pagQueryMajor + count);
		map.put("rows", pagQueryMajor);
		map.put("total", count);
		return map;
	}

}
