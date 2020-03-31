package com.hr.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringFormatToDate implements Converter<String, Date> {
	
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		if (source == null) {
			throw new RuntimeException("参数为空 in public Date convert(String source)");
		}

		try {
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date parse = simple.parse(source);
			return parse;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("类型转换异常来自 custom type parse");
		}

	}

}
