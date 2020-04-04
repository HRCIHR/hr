package com.hr.entity;

import java.util.Date;

public class EngageInterview {
	private Short einId;

	private String humanName;

	private Short humanMajorId;

	private String imageDegree;

	private String nativeLanguageDegree;

	private String foreignLanguageDegree;

	private String responseSpeedDegree;

	private String eqDegree;

	private String iqDegree;

	private String multiQualityDegree;

	private String register;

	private String checker;

	private Date registeTime;

	private Date checkTime;

	private Short resumeId;

	private String result;

	private Short checkStatus;
	private String interviewComment;

	private String checkComment;

	private EngageResume engageResume;
	
	public EngageResume getEngageResume() {
		return engageResume;
	}

	public void setEngageResume(EngageResume engageResume) {
		this.engageResume = engageResume;
	}

	public Short getEinId() {
		return einId;
	}

	public void setEinId(Short einId) {
		this.einId = einId;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public Short getHumanMajorId() {
		return humanMajorId;
	}

	public void setHumanMajorId(Short humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getImageDegree() {
		return imageDegree;
	}

	public void setImageDegree(String imageDegree) {
		this.imageDegree = imageDegree;
	}

	public String getNativeLanguageDegree() {
		return nativeLanguageDegree;
	}

	public void setNativeLanguageDegree(String nativeLanguageDegree) {
		this.nativeLanguageDegree = nativeLanguageDegree;
	}

	public String getForeignLanguageDegree() {
		return foreignLanguageDegree;
	}

	public void setForeignLanguageDegree(String foreignLanguageDegree) {
		this.foreignLanguageDegree = foreignLanguageDegree;
	}

	public String getResponseSpeedDegree() {
		return responseSpeedDegree;
	}

	public void setResponseSpeedDegree(String responseSpeedDegree) {
		this.responseSpeedDegree = responseSpeedDegree;
	}

	public String getEqDegree() {
		return eqDegree;
	}

	public void setEqDegree(String eqDegree) {
		this.eqDegree = eqDegree;
	}

	public String getIqDegree() {
		return iqDegree;
	}

	public void setIqDegree(String iqDegree) {
		this.iqDegree = iqDegree;
	}

	public String getMultiQualityDegree() {
		return multiQualityDegree;
	}

	public void setMultiQualityDegree(String multiQualityDegree) {
		this.multiQualityDegree = multiQualityDegree;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Date getRegisteTime() {
		return registeTime;
	}

	public void setRegisteTime(Date registeTime) {
		this.registeTime = registeTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Short getResumeId() {
		return resumeId;
	}

	public void setResumeId(Short resumeId) {
		this.resumeId = resumeId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Short getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getInterviewComment() {
		return interviewComment;
	}

	public void setInterviewComment(String interviewComment) {
		this.interviewComment = interviewComment;
	}

	public String getCheckComment() {
		return checkComment;
	}

	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
	}

	@Override
	public String toString() {
		return "EngageInterview [einId=" + einId + ", humanName=" + humanName + ", humanMajorId=" + humanMajorId
				+ ", imageDegree=" + imageDegree + ", nativeLanguageDegree=" + nativeLanguageDegree
				+ ", foreignLanguageDegree=" + foreignLanguageDegree + ", responseSpeedDegree=" + responseSpeedDegree
				+ ", eqDegree=" + eqDegree + ", iqDegree=" + iqDegree + ", multiQualityDegree=" + multiQualityDegree
				+ ", register=" + register + ", checker=" + checker + ", registeTime=" + registeTime + ", checkTime="
				+ checkTime + ", resumeId=" + resumeId + ", result=" + result + ", checkStatus=" + checkStatus
				+ ", interviewComment=" + interviewComment + ", checkComment=" + checkComment + ", engageResume="
				+ engageResume + "]";
	}


}