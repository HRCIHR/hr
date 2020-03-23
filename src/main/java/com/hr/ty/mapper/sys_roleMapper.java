package com.hr.ty.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_role;
@Repository
public interface sys_roleMapper {
   public sys_role queryRoleById(Integer roleId);//查角色带权限
   
   public sys_role queryRoleByIdtwo(Integer roleId);//只查角色
   
   public List<sys_role>queryRole();//查询全部角色
}