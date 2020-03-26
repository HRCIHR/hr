package com.hr.entity;

public class ConfigPublicChar {
    private Integer pbcId;

    private String attributeKind;

    private String attributeName;

    public Integer getPbcId() {
        return pbcId;
    }

    public void setPbcId(Integer pbcId) {
        this.pbcId = pbcId;
    }

    public String getAttributeKind() {
        return attributeKind;
    }

    public void setAttributeKind(String attributeKind) {
        this.attributeKind = attributeKind == null ? null : attributeKind.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}