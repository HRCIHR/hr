package com.hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MajorChange {
    private Short mchId;

    private Short thirdKindId;

    private Short majorId;

    private Short newThirdKindId;

    private Short newMajorId;

    private String humanId;

    private String salaryStandardId;

    private BigDecimal salarySum;

    private String newSalaryStandardId;

    private BigDecimal newSalarySum;

    private Short checkStatus;

    private String register;

    private String checker;

    private Date registTime;

    private Date checkTime;

    public Short getMchId() {
        return mchId;
    }

    public void setMchId(Short mchId) {
        this.mchId = mchId;
    }

    public Short getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(Short thirdKindId) {
        this.thirdKindId = thirdKindId;
    }

    public Short getMajorId() {
        return majorId;
    }

    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    public Short getNewThirdKindId() {
        return newThirdKindId;
    }

    public void setNewThirdKindId(Short newThirdKindId) {
        this.newThirdKindId = newThirdKindId;
    }

    public Short getNewMajorId() {
        return newMajorId;
    }

    public void setNewMajorId(Short newMajorId) {
        this.newMajorId = newMajorId;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId == null ? null : humanId.trim();
    }

    public String getSalaryStandardId() {
        return salaryStandardId;
    }

    public void setSalaryStandardId(String salaryStandardId) {
        this.salaryStandardId = salaryStandardId == null ? null : salaryStandardId.trim();
    }

    public BigDecimal getSalarySum() {
        return salarySum;
    }

    public void setSalarySum(BigDecimal salarySum) {
        this.salarySum = salarySum;
    }

    public String getNewSalaryStandardId() {
        return newSalaryStandardId;
    }

    public void setNewSalaryStandardId(String newSalaryStandardId) {
        this.newSalaryStandardId = newSalaryStandardId == null ? null : newSalaryStandardId.trim();
    }

    public BigDecimal getNewSalarySum() {
        return newSalarySum;
    }

    public void setNewSalarySum(BigDecimal newSalarySum) {
        this.newSalarySum = newSalarySum;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
}