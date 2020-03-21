package com.hr.ty.mapper;

import org.springframework.stereotype.Repository;

import com.hr.entity.users;
@Repository
public interface usersMapper {
	users querUserByNameAndPwd(users user);
}