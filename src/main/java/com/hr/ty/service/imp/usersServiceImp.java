package com.hr.ty.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.users;
import com.hr.ty.mapper.usersMapper;
import com.hr.ty.service.usersService;
@Service
public class usersServiceImp implements usersService{
    @Autowired
    private usersMapper um;
	@Override
	public users querUserByNameAndPwd(users user) {
		// TODO Auto-generated method stub
		System.out.println("usersServiceImp-querUserByNameAndPwd");
		return um.querUserByNameAndPwd(user);
	}

}
