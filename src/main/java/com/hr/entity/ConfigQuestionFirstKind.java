package com.hr.entity;

public class ConfigQuestionFirstKind {
    private Short firstKindId;

    private String firstKindName;

    public Short getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(Short firstKindId) {
        this.firstKindId = firstKindId;
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName == null ? null : firstKindName.trim();
    }
}