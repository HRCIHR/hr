package com.hr.ty.util;

import java.util.ArrayList;
import java.util.List;

import com.hr.entity.sys_right;


public class MyUtil {
	/**
	 * 根据父类ID找子类菜单
	 * 
	 */
	public static List<sys_right> getRightByParentId(List<sys_right> list, Integer parentId) {
		List<sys_right> meun = new ArrayList<sys_right>();
		for (sys_right r : list) {
			if (r.getRightParentCode() == parentId) {
				meun.add(r);
			}
		}
		return meun;
	}
}
