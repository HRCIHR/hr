package com.hr.ty.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	/**
	 * 菜单找儿子的方法
	 */
	public static void getSon(List<sys_right> list, Map<String, Object> fatherMap, Integer fatherId) {
		// 存放儿子的集合
		List<Map<String, Object>> sons = new ArrayList<Map<String, Object>>();
		for (sys_right sr : list) {
			// 判断是不是指定的儿子
			if (sr.getRightParentCode() == fatherId) {
				Map<String, Object> son = new HashMap<String, Object>();
				son.put("id", sr.getRightCode());
				son.put("text", sr.getRightText());
				Map<String, Object> attr = new HashMap<String, Object>();
				attr.put("url", sr.getRightUrl());
				attr.put("tip", sr.getRightTip());
				attr.put("pid", sr.getRightParentCode());
				son.put("attributes", attr);
				// 此儿子节点还是别人的父亲,sr.getRight_parent_code()!=0 表示不是最大根节点
				if ("fatcherNode".equals(sr.getRightType()) && sr.getRightParentCode() != 0) {
					son.put("state", "open");
					// 找当前对象的儿子
					getSon(list, son, sr.getRightCode());
				}
				// 把儿子存放到儿子集合
				sons.add(son);
			}
		}
		// 把儿子绑定到父亲
		fatherMap.put("children", sons);
	}
}
