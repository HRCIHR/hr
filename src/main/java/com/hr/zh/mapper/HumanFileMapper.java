package com.hr.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.HumanFile;
import com.hr.util.HumanFileCase;
import com.hr.util.pagination;

@Repository
public interface HumanFileMapper {

	Integer saveHumanFile(@Param("sql") String value, @Param("humanFile") HumanFile humanFile);

	Integer updateHumanFile(@Param("sql") String value, @Param("humanFile") HumanFile humanFile);

	List<HumanFile> queryHumanFileByCheckStatus(@Param("status") Integer satus, @Param("pa") pagination page);

	Integer queryHumanFileByCheckStatusCount(Integer satus);

	List<HumanFile> queryHumanFileByCase(@Param("humanFileCase") HumanFileCase humanFileCase,
			@Param("pa") pagination page);

	List<HumanFile> queryHumanFileByCaseCount(HumanFileCase humanFileCase);
	
	
	HumanFile queryHumanFileByhuman_Id(String humanID);
	
	Integer DelHumanFileByHumanID(String humanID);
}
