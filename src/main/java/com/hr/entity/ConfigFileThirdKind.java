package com.hr.entity;

public class ConfigFileThirdKind {
    private Integer thirdKindId;

    private String thirdKindName;

    private Integer firstKindId;

    private Integer secondKindId;

    private String thirdKindSaleId;

    private String thirdKindIsRetail;

    public Integer getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(Integer thirdKindId) {
        this.thirdKindId = thirdKindId;
    }

    public String getThirdKindName() {
        return thirdKindName;
    }

    public void setThirdKindName(String thirdKindName) {
        this.thirdKindName = thirdKindName == null ? null : thirdKindName.trim();
    }

    public Integer getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(Integer firstKindId) {
        this.firstKindId = firstKindId;
    }

    public Integer getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Integer secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getThirdKindSaleId() {
        return thirdKindSaleId;
    }

    public void setThirdKindSaleId(String thirdKindSaleId) {
        this.thirdKindSaleId = thirdKindSaleId == null ? null : thirdKindSaleId.trim();
    }

    public String getThirdKindIsRetail() {
        return thirdKindIsRetail;
    }

    public void setThirdKindIsRetail(String thirdKindIsRetail) {
        this.thirdKindIsRetail = thirdKindIsRetail == null ? null : thirdKindIsRetail.trim();
    }
}