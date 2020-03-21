package com.hr.entity;

public class users {
	private Integer uId;

	private String uName;

	private String uTrueName;

	private String uPassword;

	//private Integer uRoleid;

	private sys_role role;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuTrueName() {
		return uTrueName;
	}

	public void setuTrueName(String uTrueName) {
		this.uTrueName = uTrueName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public sys_role getRole() {
		return role;
	}

	public void setRole(sys_role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "users [uId=" + uId + ", uName=" + uName + ", uTrueName=" + uTrueName + ", uPassword=" + uPassword
				+ ", role=" + role + "]";
	}
	
}