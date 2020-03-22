package com.hr.ty.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hr.entity.sys_right;
import com.hr.entity.users;
import com.hr.ty.service.sys_rightService;
import com.hr.ty.util.MyUtil;

@Controller
@RequestMapping("SysRight")
public class Sys_RightController {
	@Autowired
	private sys_rightService srs;

	@RequestMapping("/querySysRightJson")
	@ResponseBody
	public List querySysRightJson(HttpSession session, Integer id) {
		if (id == null) {
			id = 0;
		}
		List<sys_right> userList = ((users) session.getAttribute("user")).getRole().getRights();
		List<sys_right> list = MyUtil.getRightByParentId(userList, id);
		List<Map<String, Object>> meunList = new ArrayList<Map<String, Object>>();
		for (sys_right sysRight : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", sysRight.getRightCode());
			map.put("text", sysRight.getRightText());
			if ("fatcherNode".equals(sysRight.getRightType())) {
				map.put("state", "closed");
			} else {
				Map<String, Object> attr = new HashMap<String, Object>();
				System.out.println(sysRight.getRightUrl() + sysRight.getRightText());
				attr.put("url", sysRight.getRightUrl());
				attr.put("text", sysRight.getRightText());

				map.put("attributes", attr);
			}
			meunList.add(map);
		}
		return meunList;
	}
}
