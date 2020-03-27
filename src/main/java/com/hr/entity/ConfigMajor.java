package com.hr.entity;

public class ConfigMajor {
    private Integer majorId;

	private String majorName;

	private Integer majorKindId;

	private Integer testAmount;
	private ConfigMajorKind configMajorKind;

	public ConfigMajorKind getConfigMajorKind() {
		return configMajorKind;
	}

	public void setConfigMajorKind(ConfigMajorKind configMajorKind) {
		this.configMajorKind = configMajorKind;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName == null ? null : majorName.trim();
	}

	public Integer getMajorKindId() {
		return majorKindId;
	}

	public void setMajorKindId(Integer majorKindId) {
		this.majorKindId = majorKindId;
	}

	public Integer getTestAmount() {
		return testAmount;
	}

	public void setTestAmount(Integer testAmount) {
		this.testAmount = testAmount;
	}

	@Override
	public String toString() {
		return "ConfigMajor [majorId=" + majorId + ", majorName=" + majorName + ", majorKindId=" + majorKindId
				+ ", testAmount=" + testAmount + ", configMajorKind=" + configMajorKind + "]";
	}

}