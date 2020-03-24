package com.hr.entity;

public class ConfigFileSecondKind {
    private Integer secondKindId;

    private String secondKindName;

    private Integer firstKindId;

    private String secondSalaryId;

    private String secondSaleId;

    public Integer getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Integer secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName == null ? null : secondKindName.trim();
    }

    public Integer getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(Integer firstKindId) {
        this.firstKindId = firstKindId;
    }

    public String getSecondSalaryId() {
        return secondSalaryId;
    }

    public void setSecondSalaryId(String secondSalaryId) {
        this.secondSalaryId = secondSalaryId == null ? null : secondSalaryId.trim();
    }

    public String getSecondSaleId() {
        return secondSaleId;
    }

    public void setSecondSaleId(String secondSaleId) {
        this.secondSaleId = secondSaleId == null ? null : secondSaleId.trim();
    }
}