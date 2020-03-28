package com.hr.zh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.util.pagination;
import com.hr.zh.service.SecondKindService;

@Controller
@RequestMapping("SecondKind")
public class SecondKindController {

	@Resource(name = "SecondKindServiceImp")
	private SecondKindService secondKindService;

	// 分页查询
	@RequestMapping("/pagQuerySecondKind")
	public @ResponseBody Map<String, Object> pagQuerySecondKind(pagination page) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<ConfigFileSecondKind> querySecondKind = secondKindService.pagQuerySecondKind(page);
		for (ConfigFileSecondKind configFileSecondKind : querySecondKind) {
			System.out.println(configFileSecondKind);
		}
		Integer count = secondKindService.QuerySecondKindCount();
		map.put("rows", querySecondKind);
		map.put("total", count);

		return map;
	}

	// 添加
	@RequestMapping("/saveSecondKind") // SecondKind/saveSecondKind
	public @ResponseBody boolean saveSecondKind(ConfigFileSecondKind secondKind) {

		System.out.println(secondKind);
		Boolean success = secondKindService.saveSecondKind(secondKind);
		return success;
	}

	@RequestMapping("/updateSecondKind") // SecondKind/updateSecondKind
	public @ResponseBody boolean updateSecondKind(ConfigFileSecondKind secondKind) {

		System.out.println(secondKind);
		Boolean success = secondKindService.updateSecondKind(secondKind);
		return success;
	}

	@RequestMapping("/delSecondKind") // SecondKind/delSecondKind
	public @ResponseBody boolean delSecondKind(Integer secondKindID) {

		System.out.println(secondKindID);
		Boolean success = secondKindService.delSecondKind(secondKindID);
		return success;
	}

	// querySecondKindByFirstId
	@RequestMapping("/querySecondKindByFirstId") // SecondKind/querySecondKindByFirstId
	public @ResponseBody List<ConfigFileSecondKind> querySecondKindByFirstId(Integer firstKindId) {
		
		List<ConfigFileSecondKind> firstId = secondKindService.querySecondKindByFirstId(firstKindId);
		return firstId;
	}

}
