package com.hr.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hr.entity.sys_role;
import com.hr.ty.mapper.sys_roleMapper;
import com.hr.ty.mapper.usersMapper;
import com.hr.ty.service.sys_roleService;

@Service
public class sys_roleServiceImp implements sys_roleService {
	@Autowired
	private sys_roleMapper sm;

	@Autowired
	private usersMapper um;
	@Override
	public List<sys_role> queryRole() {
		// TODO Auto-generated method stub
		return sm.queryRole();
	}

	@Override
	public Integer insertRole(sys_role role) {
		// TODO Auto-generated method stub
		Integer integer = sm.insertRole(role);
		return integer;
	}

	@Override
	public sys_role queryRoleAndRightByRoleId(sys_role role) {
		// TODO Auto-generated method stub
		return sm.queryRoleById(role.getRoleId());
	}

	@Override
	@Transactional
	public Integer deleteRoleById(sys_role role) {
		//判断是否有用户在使用角色
				Integer count=um.queryUserCountByRoleId(role.getRoleId());
				if(count==0) {//表示角色没有用使用，可以删除
					//先删除中间表数据
					sm.deleteRoleRightByRoleId(role.getRoleId());
					//再删除角色
					sm.deleteRoleById(role);
					return 1;
				}
				return 0;
	}

	@Override
	@Transactional
	public Integer updateRole(sys_role role, Integer[] rightId) {
		//刪除中間表中的数据
		Integer num1=sm.deleteRoleRightByRoleId(role.getRoleId());
		//修改角色
		Integer num2=sm.updateRole(role);
		//添加中间表的数据
			Integer num3=sm.saveRoleAndRight(rightId, role.getRoleId());
			System.out.println(num1+"/"+num2+"/"+num3);
		return 1;
	}

	@Override
	public Integer deleteRoleRightByRoleId(sys_role role) {
		// TODO Auto-generated method stub
		return sm.deleteRoleRightByRoleId(role.getRoleId());
	}
}
