package com.hr.zh.service.imp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.HumanFile;
import com.hr.util.HumanFileCase;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.HumanFileMapper;
import com.hr.zh.mapper.HumanFileDigMapper;
import com.hr.zh.service.HumanFileService;

@Service
@Transactional
public class HumanFileServiceImp implements HumanFileService {

	@Autowired
	private HumanFileMapper humanFileMapper;
	@Autowired
	private HumanFileDigMapper humanFileMapperDig;

	@Override
	public Boolean saveHumanFile(HumanFile humanFile) {
		// TODO Auto-generated method stub
		humanFile.setHuman_Id("HF" + UUID.randomUUID().toString().substring(24));
		humanFile.setHuman_File_Status(0);
		String newSql = saveSqlFromat(humanFile);

		System.out.println(newSql);
		Integer saveHumanFile = humanFileMapper.saveHumanFile(newSql, humanFile);

		boolean success = MasterTool.isSuccess(saveHumanFile);
		return success;
	}

	@Override
	public Boolean updateHumanFile(HumanFile humanFile) {
		// TODO Auto-generated method stub
		humanFile.setHuman_File_Status(1);
		String newSql = updateSqlFromat(humanFile);
		System.out.println(newSql);
		Integer updateHumanFile = humanFileMapper.updateHumanFile(newSql, humanFile);
		boolean success = MasterTool.isSuccess(updateHumanFile);
		return success;
	}

	public static String updateSqlFromat(HumanFile humanFile) {
		String newSql = null;
		try {
			Class classes = humanFile.getClass();
			Field[] declaredFields = classes.getDeclaredFields();
			List<String> key = new ArrayList<String>();

			for (Field field : declaredFields) {
				field.setAccessible(true);

				Object value = field.get(humanFile);
				if (value != null && value.toString().length() > 0 && value != "") {
					if (!"human_Id".equals(field.getName())) {
						key.add(field.getName());
					}

				}
			}

			StringBuffer sql = new StringBuffer("UPDATE human_file SET ");

			for (int a = 0; a < key.size(); a++) {
				sql.append(key.get(a) + "=#{humanFile." + key.get(a) + "}");

				if (a != key.size() - 1) {
					sql.append(",");

				}

			}

			newSql = sql + " where human_Id=#{humanFile.human_Id}";
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newSql;
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
	public static String saveSqlFromatIsDig(HumanFile humanFile) {
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

			StringBuffer prefix = new StringBuffer("insert into human_file_dig (");
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
	@Override
	public List<HumanFile> queryHumanFileByCheckStatus(Integer satus, pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		return humanFileMapper.queryHumanFileByCheckStatus(satus, page);
	}

	@Override
	public Integer queryHumanFileByCheckStatusCount(Integer satus) {
		// TODO Auto-generated method stub
		Integer queryHumanFileByCheckStatusCount = humanFileMapper.queryHumanFileByCheckStatusCount(satus);
		return queryHumanFileByCheckStatusCount;
	}

	@Override
	public List<HumanFile> queryHumanFileByCase(HumanFileCase humanFileCase, pagination page) {
		// TODO Auto-generated method stub
		pagination.pageformat(page);
		List<HumanFile> queryHumanFileByCase = humanFileMapper.queryHumanFileByCase(humanFileCase, page);
		return queryHumanFileByCase;
	}

	@Override
	public List<HumanFile> queryHumanFileByCaseCount(HumanFileCase humanFileCase) {
		// TODO Auto-generated method stub
		return humanFileMapper.queryHumanFileByCaseCount(humanFileCase);
	}

	@Override
	public Boolean changeHumanFile(HumanFile humanFile) {
		// TODO Auto-generated method stub
		//1.需要根据id查询所有数据 然后将输入放入sqlformat中建出添加语句 添加到修改日志表中
		//2.修改当前表的数据以及状态
		//3.
	//1.
	HumanFile queryHumanFileByhuman_Id = humanFileMapper.queryHumanFileByhuman_Id(humanFile.getHuman_Id());
	
	//2.
	
	queryHumanFileByhuman_Id.setFirst_Kind_Id(null);
	queryHumanFileByhuman_Id.setSecond_Kind_Id(null);
	String saveSqlFromatIsDig = saveSqlFromatIsDig(queryHumanFileByhuman_Id);
	Integer saveHumanFileDig = humanFileMapperDig.saveHumanFileDig(saveSqlFromatIsDig, queryHumanFileByhuman_Id);
		
	//3.
	humanFile.setCheck_Status(0);
	String newSql = updateSqlFromat(humanFile);
	Integer updateHumanFile = humanFileMapper.updateHumanFile(newSql, humanFile);
	boolean f=false;
	if(updateHumanFile==saveHumanFileDig) {
		f=true;
	}
	
		return f;
	}

	@Override
	public Boolean HumanFileStatus(HumanFile humanFile) {
		// TODO Auto-generated method stub
		
		String updateSqlFromat = updateSqlFromat(humanFile);
		Integer updateHumanFile = humanFileMapper.updateHumanFile(updateSqlFromat, humanFile);
		boolean success = MasterTool.isSuccess(updateHumanFile);		
		return success;
	}

	@Override
	public Boolean DelFileStatus(String humanID) {
		// TODO Auto-generated method stub
		Integer delHumanFileByHumanID = humanFileMapper.DelHumanFileByHumanID(humanID);
		boolean success = MasterTool.isSuccess(delHumanFileByHumanID);
		return success;
	}

}
