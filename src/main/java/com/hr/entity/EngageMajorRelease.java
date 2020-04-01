package com.hr.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.google.gson.annotations.JsonAdapter;

public class EngageMajorRelease {
	private Integer mreId;

	private Integer thirdKindId;

	private Integer majorId;

	private Integer humanAmount;

	private String engageType;
	
	private Date deadline;

	private String register;

	private String changer;

	private Date registTime;

	private Date changeTime;

	private String engageRequired;

	private String majorDescribe;

	private ConfigFileThirdKind configFileThirdKind;

	private ConfigMajor configMajor;

	public ConfigFileThirdKind getConfigFileThirdKind() {
		return configFileThirdKind;
	}

	public void setConfigFileThirdKind(ConfigFileThirdKind configFileThirdKind) {
		this.configFileThirdKind = configFileThirdKind;
	}

	public ConfigMajor getConfigMajor() {
		return configMajor;
	}

	public void setConfigMajor(ConfigMajor configMajor) {
		this.configMajor = configMajor;
	}

	public String getEngageRequired() {
		return engageRequired;
	}

	public void setEngageRequired(String engageRequired) {
		this.engageRequired = engageRequired;
	}

	public String getMajorDescribe() {
		return majorDescribe;
	}

	public void setMajorDescribe(String majorDescribe) {
		this.majorDescribe = majorDescribe;
	}

	public Integer getMreId() {
		return mreId;
	}

	public void setMreId(Integer mreId) {
		this.mreId = mreId;
	}

	public Integer getThirdKindId() {
		return thirdKindId;
	}

	public void setThirdKindId(Integer thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public Integer getHumanAmount() {
		return humanAmount;
	}

	public void setHumanAmount(Integer humanAmount) {
		this.humanAmount = humanAmount;
	}

	public String getEngageType() {
		return engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Date getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}

	@Override
	public String toString() {
		return "EngageMajorRelease [mreId=" + mreId + ", thirdKindId=" + thirdKindId + ", majorId=" + majorId
				+ ", humanAmount=" + humanAmount + ", engageType=" + engageType + ", deadline=" + deadline
				+ ", register=" + register + ", changer=" + changer + ", registTime=" + registTime + ", changeTime="
				+ changeTime + ", engageRequired=" + engageRequired + ", majorDescribe=" + majorDescribe
				+ ", configFileThirdKind=" + configFileThirdKind + ", configMajor=" + configMajor + "]";
	}

}