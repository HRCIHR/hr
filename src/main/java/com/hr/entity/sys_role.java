package com.hr.entity;

import java.util.List;

public class sys_role {
    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private String roleFlag;

    private List<sys_right> rights;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleFlag() {
		return roleFlag;
	}

	public void setRoleFlag(String roleFlag) {
		this.roleFlag = roleFlag;
	}

	public List<sys_right> getRights() {
		return rights;
	}

	public void setRights(List<sys_right> rights) {
		this.rights = rights;
	}

	@Override
	public String toString() {
		return "sys_role [roleId=" + roleId + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", roleFlag="
				+ roleFlag + ", rights=" + rights + "]";
	}


    
}