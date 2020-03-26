package com.hr.entity;

public class ConfigFileFirstKind {
    private Integer firstKindId;

    private String firstKindName;

    private String firstKindSalaryId;

    private String firstKindSaleId;

	@Override
	public String toString() {
		return "ConfigFileFirstKind [firstKindId=" + firstKindId + ", firstKindName=" + firstKindName
				+ ", firstKindSalaryId=" + firstKindSalaryId + ", firstKindSaleId=" + firstKindSaleId + "]";
	}

	public Integer getFirstKindId() {
		return firstKindId;
	}

	public void setFirstKindId(Integer firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public String getFirstKindSalaryId() {
		return firstKindSalaryId;
	}

	public void setFirstKindSalaryId(String firstKindSalaryId) {
		this.firstKindSalaryId = firstKindSalaryId;
	}

	public String getFirstKindSaleId() {
		return firstKindSaleId;
	}

	public void setFirstKindSaleId(String firstKindSaleId) {
		this.firstKindSaleId = firstKindSaleId;
	}

    
    
}