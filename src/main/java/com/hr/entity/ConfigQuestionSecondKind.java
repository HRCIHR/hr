package com.hr.entity;

public class ConfigQuestionSecondKind {
    private Short secondKindId;

    private String secondKindName;

    private Short firstKindId;

    public Short getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Short secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName == null ? null : secondKindName.trim();
    }

    public Short getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(Short firstKindId) {
        this.firstKindId = firstKindId;
    }
}