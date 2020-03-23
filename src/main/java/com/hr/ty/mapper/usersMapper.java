package com.hr.ty.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.users;
import com.hr.util.pagination;
@Repository
public interface usersMapper {
	users querUserByNameAndPwd(users user);
	
	List<users> querUserAndRole(pagination page);//分页查询
	
	Integer insertUser(users user);
}