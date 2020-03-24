package com.hr.entity;

import java.math.BigDecimal;

public class SalaryGrantDetails {
    private Short grdId;

    private String salaryGrantId;

    private String humanId;

    private BigDecimal bounsSum;

    private BigDecimal saleSum;

    private BigDecimal deductSum;

    private BigDecimal salaryStandardSum;

    private BigDecimal salaryPaidSum;

    public Short getGrdId() {
        return grdId;
    }

    public void setGrdId(Short grdId) {
        this.grdId = grdId;
    }

    public String getSalaryGrantId() {
        return salaryGrantId;
    }

    public void setSalaryGrantId(String salaryGrantId) {
        this.salaryGrantId = salaryGrantId == null ? null : salaryGrantId.trim();
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId == null ? null : humanId.trim();
    }

    public BigDecimal getBounsSum() {
        return bounsSum;
    }

    public void setBounsSum(BigDecimal bounsSum) {
        this.bounsSum = bounsSum;
    }

    public BigDecimal getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(BigDecimal saleSum) {
        this.saleSum = saleSum;
    }

    public BigDecimal getDeductSum() {
        return deductSum;
    }

    public void setDeductSum(BigDecimal deductSum) {
        this.deductSum = deductSum;
    }

    public BigDecimal getSalaryStandardSum() {
        return salaryStandardSum;
    }

    public void setSalaryStandardSum(BigDecimal salaryStandardSum) {
        this.salaryStandardSum = salaryStandardSum;
    }

    public BigDecimal getSalaryPaidSum() {
        return salaryPaidSum;
    }

    public void setSalaryPaidSum(BigDecimal salaryPaidSum) {
        this.salaryPaidSum = salaryPaidSum;
    }
}