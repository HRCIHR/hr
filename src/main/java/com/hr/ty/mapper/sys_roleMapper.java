package com.hr.ty.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.sys_role;
@Repository
public interface sys_roleMapper {
   public sys_role queryRoleById(Integer roleId);//查角色带权限
   
   public sys_role queryRoleByIdtwo(Integer roleId);//只查角色
   
   public List<sys_role>queryRole();//查询全部角色
   
   public Integer insertRole(sys_role role);//添加角色
   
   public Integer deleteRoleById(sys_role role);//删除角色
   
   public Integer deleteRoleRightByRoleId(Integer roleId);

	public Integer updateRole(sys_role role);
	
	public Integer saveRoleAndRight(@Param("rightId") Integer[] rightId,@Param("roleId") Integer roleId);
}