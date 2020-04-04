package com.hr.zh.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.EngageResume;
import com.hr.util.ResumeCase;
import com.hr.util.pagination;

@Repository
public interface ResumeMapper {

	Integer saveResume(@Param("Resume") EngageResume Resume, @Param("value") String sql);

	Integer updateResume(@Param("Resume") EngageResume Resume, @Param("value") String sql);

	// keyword begin status
	List<EngageResume> queryResumeByCase(@Param("resumeCase") ResumeCase resumeCase, @Param("page") pagination page);

	Integer queryResumeByCaseCount(@Param("resumeCase") ResumeCase resumeCase);

	EngageResume queryResumeByID(Integer id);

}
