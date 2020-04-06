package com.hr.zh.service.imp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.EngageInterview;
import com.hr.entity.EngageResume;
import com.hr.entity.HumanFile;
import com.hr.util.MasterTool;
import com.hr.util.ResumeCase;
import com.hr.util.pagination;
import com.hr.zh.mapper.HumanFileMapper;
import com.hr.zh.mapper.InterviewMapper;
import com.hr.zh.mapper.ResumeMapper;
import com.hr.zh.service.ResumeService;

@Service
@Transactional
public class ResumeServiceImp implements ResumeService {
	@Autowired
	private HumanFile human;
	@Autowired
	private ResumeMapper resumeMapper;
	@Autowired
	private InterviewMapper interviewMapper;
	@Autowired
	private HumanFileMapper humanFileMapper;

	@Override
	public Boolean saveResume(EngageResume Resume) {
		// TODO Auto-generated method stub
		// 字段多 遍历 自己搞sql语句
		String sqlFormat = MasterTool.sqlFormat(Resume);
//		System.out.println("sql语句:" + sqlFormat);
		Integer saveResume = resumeMapper.saveResume(Resume, sqlFormat);
		boolean success = MasterTool.isSuccess(saveResume);
		return success;
	}

	@Override
	public List<EngageResume> queryResumeByCase(ResumeCase resumeCase, pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		System.out.println(resumeCase);

		List<EngageResume> queryResumeByCase = resumeMapper.queryResumeByCase(resumeCase, page);
		return queryResumeByCase;
	}

	@Override
	public Integer queryResumeByCaseCount(ResumeCase resumeCase) {
		// TODO Auto-generated method stub
		Integer queryResumeByCaseCount = resumeMapper.queryResumeByCaseCount(resumeCase);

		return queryResumeByCaseCount;
	}

	@Override
	public Boolean updateResume(EngageResume Resume) {
		// TODO Auto-generated method stub

		String sqlFormat = MasterTool.updatesqlFormat(Resume);
//		System.out.println("sql语句:" + sqlFormat);
		Integer updatecount = resumeMapper.updateResume(Resume, sqlFormat);
		boolean success = MasterTool.isSuccess(updatecount);
		return success;

	}

	@Override
	public Boolean updateResumeApply(EngageResume resume, EngageInterview interview) {
		// TODO Auto-generated method stub

		if (resume.getPass_CheckStatus() == 0) {
			interview.setCheckStatus((short) 0);
		} else {
			interview.setCheckStatus((short) 4);
		}
//			要一个修改 状态为0的
		Integer updateInterViewStatuszero = interviewMapper.updateInterViewStatuszero(interview);

		Integer updateResumeApply = resumeMapper.updateResumeApply(resume);
		boolean f = false;
		if (updateInterViewStatuszero == updateResumeApply) {
			f = true;
		}

		return f;
	}

	@Override
	public Boolean updateResumeApplytwo(EngageResume resume, EngageInterview interview) {
		// TODO Auto-generated method stub

		if (resume.getPass_CheckStatus() == 0) {
			interview.setCheckStatus((short) 0);
		} else {
			interview.setCheckStatus((short) 5);
		}

		Integer updateInterViewStatuszero = interviewMapper.updateInterViewStatuszero(interview);
		Integer updateResumeApply = resumeMapper.updateResumeApplytwo(resume);

		boolean f = false;
		if (updateInterViewStatuszero == updateResumeApply) {
			f = true;
			// 需要一条添加 添加员工档案
			// 添加员工档案
			human.setHuman_Id("HF" + UUID.randomUUID().toString().substring(24));
			human.setHuman_Name(resume.getHuman_Name());
			human.setHuman_Address(resume.getHuman_Address());
			human.setHuman_Postcode(resume.getHuman_Postcode());
			human.setHuman_Telephone(resume.getHuman_Telephone());
			human.setHuman_Age(resume.getHuman_Age());
			human.setHuman_Hobby(resume.getHuman_Hobby());
			human.setHuman_Email(resume.getHuman_Email());
			human.setHuman_Sex(resume.getHuman_Sex());
			human.setHuman_Mobilephone(resume.getHuman_Mobilephone());
			human.setHuman_Id_Card(resume.getHuman_Idcard());
			human.setHuman_Birthday(resume.getHuman_Birthday());
			human.setHuman_Birthplace(resume.getHuman_Birthplace());
			human.setRegister(resume.getRegister());
			human.setRegist_Time(resume.getRegist_Time());
			human.setHuman_Major_Id(resume.getHuman_Major_Id());
			human.setHuman_Histroy_Records(resume.getHuman_History_Records());
			human.setHuman_Religion(resume.getHuman_Religion());
			human.setHuman_Party(resume.getHuman_Party());
			human.setHuman_Nationality(resume.getHuman_Nationality());
			human.setHuman_Educated_Degree(resume.getHuman_Educated_Degree());
			human.setHuman_Educated_Major(resume.getHuman_Educated_Major());
			human.setHuman_Educated_Years(resume.getHuman_Educated_Years());
			String saveSqlFromat = saveSqlFromat(human);
			Integer saveHumanFile = humanFileMapper.saveHumanFile(saveSqlFromat, human);
		}

		return f;
	}

	public static String saveSqlFromat(HumanFile humanFile) {
		String newSql = null;
		try {
			Class classes = humanFile.getClass();
			Field[] declaredFields = classes.getDeclaredFields();
			List<String> key = new ArrayList<String>();

			for (Field field : declaredFields) {
				field.setAccessible(true);

				Object value = field.get(humanFile);
				if (value != null && value.toString().length() > 0 && value != "") {
					key.add(field.getName());
				}
			}

			StringBuffer prefix = new StringBuffer("insert into human_file (");
			StringBuffer suffix = new StringBuffer(") values (");

			for (int a = 0; a < key.size(); a++) {
				prefix.append(key.get(a));
				suffix.append("#{humanFile." + key.get(a) + "}");
				if (a != key.size() - 1) {
					prefix.append(",");
					suffix.append(",");
				}

			}
			prefix.append(suffix + "" + ")");
			newSql = prefix + "";
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newSql;
	}

}
