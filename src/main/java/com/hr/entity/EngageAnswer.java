package com.hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EngageAnswer {
    private Short ansId;

    private String examNumber;

    private Short resumeId;

    private String humanName;

    private String humanIdcard;

    private Short majorId;

    private Date testTime;

    private Integer useTime;

    private BigDecimal totalPoint;

    public Short getAnsId() {
        return ansId;
    }

    public void setAnsId(Short ansId) {
        this.ansId = ansId;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber == null ? null : examNumber.trim();
    }

    public Short getResumeId() {
        return resumeId;
    }

    public void setResumeId(Short resumeId) {
        this.resumeId = resumeId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public String getHumanIdcard() {
        return humanIdcard;
    }

    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard == null ? null : humanIdcard.trim();
    }

    public Short getMajorId() {
        return majorId;
    }

    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public BigDecimal getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(BigDecimal totalPoint) {
        this.totalPoint = totalPoint;
    }
}