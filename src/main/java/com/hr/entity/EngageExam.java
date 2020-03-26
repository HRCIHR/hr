package com.hr.entity;

import java.util.Date;

public class EngageExam {
    private String examNumber;

    private Short majorId;

    private String register;

    private Date registTime;

    private Integer limiteTime;

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber == null ? null : examNumber.trim();
    }

    public Short getMajorId() {
        return majorId;
    }

    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getLimiteTime() {
        return limiteTime;
    }

    public void setLimiteTime(Integer limiteTime) {
        this.limiteTime = limiteTime;
    }
}