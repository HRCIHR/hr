package com.hr.util;

import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import com.hr.entity.EngageResume;

public class MasterTool {

	public static boolean isSuccess(Integer val) {
		boolean f = false;
		if (val != null) {
			if (val > 0) {
				f = true;
			}
		}

		return f;

	}

	public static String sqlFormat(Object object) {
		System.out.println(object);
		String newslq = null;
		try {
			Class class1 = object.getClass();
			Field[] fields = class1.getDeclaredFields();
			ArrayList key = new ArrayList<Object>();
//			ArrayList value = new ArrayList<Object>();
			ArrayList type = new ArrayList<Object>();
			for (int a = 0; a < fields.length; a++) {
				fields[a].setAccessible(true);
				if (fields[a].get(object) != null
						&& fields[a].get(object) != "" & fields[a].get(object).toString().length() > 0) {
					key.add(fields[a].getName());
//					value.add(fields[a].get(engageResume));
//					type.add(fields[a].getType().getSimpleName());
				}
			}

			StringBuffer sql = new StringBuffer("insert into engage_resume (");
//			key.add("regist_Time");
//			key.add("");
			StringBuffer sqlbranch = new StringBuffer(" VALUES (");
			System.out.println(key.size());
			for (int a = 0; a < key.size(); a++) {
				sql.append(key.get(a));
				if (!key.get(a).equals("regist_Time")) {
					sqlbranch.append("#{Resume." + key.get(a) + "}");
				} else {
					sqlbranch.append("sysdate()");
				}

				if (a != key.size() - 1) {
					sql.append(",");
					sqlbranch.append(",");
				}
			}
			sql.append(")");
			sqlbranch.append(")");
			System.out.println(sql + "" + sqlbranch + "");
			newslq = sql + "" + sqlbranch + "";
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newslq;
	}

	public static String updatesqlFormat(Object object) {
		Class class1 = object.getClass();
		StringBuffer str = new StringBuffer("update engage_resume set check_Status=1 ");
		try {
			Field[] fields = class1.getDeclaredFields();
			ArrayList key = new ArrayList<Object>();
			for (int a = 0; a < fields.length; a++) {
				fields[a].setAccessible(true);
				if (fields[a].get(object) != null
						&& fields[a].get(object) != "" & fields[a].get(object).toString().length() > 0) {
					key.add(fields[a].getName());
//					value.add(fields[a].get(engageResume));
//					type.add(fields[a].getType().getSimpleName());
				}
			}

			if (key.size() != 0) {
				str.append(" , ");
			}
			key.add("check_Time");
			for (int i = 0; i < key.size(); i++) {

				if (key.get(i).equals("check_Time")) {
					str.append(key.get(i) + "=sysdate()");
				} else {
					str.append(key.get(i) + "=#{Resume." + key.get(i) + "}");
				}

				if (i != key.size() - 1) {
					str.append(",");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("sql语句格式化失败" + e.getMessage());

		}

		str.append(" where res_id=#{Resume.res_Id}");
		System.out.println(str.toString());
		return str.toString();
	}

	public static void main(String[] args) {
		EngageResume eng = new EngageResume();
		eng.setHuman_Address("张浩");
		updatesqlFormat(eng);
	}

}
