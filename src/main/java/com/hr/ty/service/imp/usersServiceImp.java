package com.hr.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.users;
import com.hr.ty.mapper.usersMapper;
import com.hr.ty.service.usersService;
import com.hr.util.pagination;

@Service
public class usersServiceImp implements usersService {
	@Autowired
	private usersMapper um;

	@Override
	public users querUserByNameAndPwd(users user) {
		// TODO Auto-generated method stub
		System.out.println("usersServiceImp-querUserByNameAndPwd");
		return um.querUserByNameAndPwd(user);
	}

	@Override
	public List<users> querUserAndRole(pagination page) {
		// TODO Auto-generated method stub
		System.out.println("usersServiceImp-querUserAndRole");
		return um.querUserAndRole(page);
	}

	@Override
	@Transactional
	public Integer insertUser(users user) {
		// TODO Auto-generated method stub
		Integer integer = um.insertUser(user);
		return integer;
	}

	@Override
	@Transactional
	public Integer deleteByPrimaryKey(int uId) {
		// TODO Auto-generated method stub
		Integer integer = um.deleteByPrimaryKey(uId);
		return integer;
	}

	@Override
	@Transactional
	public Integer updateByPrimaryKey(users record) {
		// TODO Auto-generated method stub
		Integer key = um.updateByPrimaryKey(record);
		return key;
	}

}
