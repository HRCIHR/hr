package com.hr.ty.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardWithBLOBs;
import com.hr.ty.service.SalaryStandarService;
import com.hr.util.pagination;

@Controller
@RequestMapping("Salarystandard")
public class Salary_standardController {
	@Autowired
	private SalaryStandarService ss;
	
	@RequestMapping("/querSalarystandard")
	@ResponseBody
	public Map querSalarystandard(pagination page) {
		System.out.println("薪酬标准登记复核+分页");
		List<SalaryStandard> SalaryStandard = ss.selectBycheckStatus(page);
		Integer count =ss.getTableCountByStandardId("salary_standard", "standard_id");
		System.out.println( SalaryStandard);
		Map map = new HashMap();
		map.put("total", count);
		map.put("rows", SalaryStandard);
		return map;
	}
	@RequestMapping("/Registration")
	@ResponseBody
	public Integer  Registration(SalaryStandard SalaryStandard) {
		System.out.println("登记"+SalaryStandard);
		Integer standard = ss.insertSalaryStandard(SalaryStandard);
		return standard;
		
	}
	@RequestMapping("/querSalarystandardlist")
	@ResponseBody
	public Map querSalarystandardlist(pagination page) {
		System.out.println("薪酬标准查询+分页");
		List<SalaryStandard> SalaryStandard = ss.selectSalaryStandard(page);
		Integer count =ss.getTableCountByStandard("salary_standard", "standard_id");
		System.out.println( SalaryStandard);
		Map map = new HashMap();
		map.put("total", count);
		map.put("rows", SalaryStandard);
		return map;
	}
}
