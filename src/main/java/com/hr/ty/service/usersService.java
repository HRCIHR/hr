package com.hr.ty.service;

import org.springframework.stereotype.Repository;

import com.hr.entity.users;
@Repository
public interface usersService {
	users querUserByNameAndPwd(users user);
}
