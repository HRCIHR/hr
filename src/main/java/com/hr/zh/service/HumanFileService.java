package com.hr.zh.service;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.HumanFile;
import com.hr.util.HumanFileCase;
import com.hr.util.pagination;

public interface HumanFileService {

	public Boolean saveHumanFile(HumanFile humanFile);

	public Boolean updateHumanFile(HumanFile humanFile);
	
	public Boolean changeHumanFile(HumanFile humanFile);
	
	public Boolean HumanFileStatus(HumanFile humanFile);
	
	public Boolean DelFileStatus(String humanID);

	List<HumanFile> queryHumanFileByCheckStatus(Integer satus, pagination page);

	Integer queryHumanFileByCheckStatusCount(Integer satus);

	List<HumanFile> queryHumanFileByCase(HumanFileCase humanFileCase, pagination page);

	List<HumanFile> queryHumanFileByCaseCount(HumanFileCase humanFileCase);
	
	
	
}
