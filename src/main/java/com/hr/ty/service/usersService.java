package com.hr.ty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.users;
import com.hr.util.pagination;
@Repository
public interface usersService {
	users querUserByNameAndPwd(users user);
	
	List<users> querUserAndRole(pagination page);
	
	Integer insertUser(users user);
}
