package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigPublicChar;
import com.hr.util.pagination;
import com.hr.zh.service.PublicCharService;

@Controller
@RequestMapping("PublicChar")
public class PublicCharController {

	@Resource(name = "PublicCharServiceImp")
	private PublicCharService publicCharService;

	@RequestMapping("/pagQueryPublicChar")
	public @ResponseBody Map<String, Object> pagQueryPublicChar(pagination page) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigPublicChar> queryPublicChar = publicCharService.pagQueryPublicChar(page);
		for (ConfigPublicChar configPublicChar : queryPublicChar) {
			System.out.println(configPublicChar);
		}
		Integer count = publicCharService.queryPublicCharCount();
		map.put("rows", queryPublicChar);
		map.put("total", count);
		return map;
	}

	@RequestMapping("/pagQueryPublicCharByType")
	public @ResponseBody Map<String, Object> pagQueryPublicCharByType(pagination page) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigPublicChar> queryPublicChar = publicCharService.pagQueryPublicCharByType(page, "职称");
		for (ConfigPublicChar configPublicChar : queryPublicChar) {
			System.out.println(configPublicChar);
		}
		Integer count = publicCharService.queryPublicCharByTypeCount();
		map.put("rows", queryPublicChar);
		map.put("total", count);
		return map;
	}

	@RequestMapping("/savePublicChar") // PublicChar/savePublicChar
	public @ResponseBody boolean savePublicChar(ConfigPublicChar PublicChar) {

		System.out.println(PublicChar);
		boolean success = publicCharService.savePublicChar(PublicChar);
		return success;
	}

	@RequestMapping("/delPublicChar")
	// PublicChar/delPublicChar PublicCharID
	public @ResponseBody boolean delPublicChar(Integer PublicCharID) {
		boolean success = publicCharService.delPublicChar(PublicCharID);
		System.out.println(PublicCharID);
		return success;
	}
}
