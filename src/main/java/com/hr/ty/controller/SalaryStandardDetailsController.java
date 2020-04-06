package com.hr.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hr.entity.SalaryStandardDetails;
import com.hr.ty.mapper.salary_standard_detailsMapper;
import com.hr.ty.service.Salary_standard_dedailsService;

@Controller
@RequestMapping("SalaryStandardDetails")
public class SalaryStandardDetailsController {
	@Autowired
	private Salary_standard_dedailsService ss;
	
	@RequestMapping("/Registration")
	@ResponseBody
	public Integer Registration(SalaryStandardDetails record ) {
		System.out.println("登记薪酬项目"+record);
		Integer insert = ss.insert(record);
		return insert;
		
	}
	@RequestMapping("/queryByid")
	public @ResponseBody Integer queryByid(SalaryStandardDetails record ) {
		System.out.println("根据ID查询"+record);
		
		return 1;
		
	}
}
