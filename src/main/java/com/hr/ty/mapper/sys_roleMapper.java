package com.hr.ty.mapper;

import org.springframework.stereotype.Repository;

import com.hr.entity.sys_role;
@Repository
public interface sys_roleMapper {
   public sys_role queryRoleById(Integer roleId);
}