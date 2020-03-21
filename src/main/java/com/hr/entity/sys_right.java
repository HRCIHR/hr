package com.hr.entity;

public class sys_right {
    private Integer rightCode;

    private Integer rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(Integer rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }

	@Override
	public String toString() {
		return "sys_right [rightCode=" + rightCode + ", rightParentCode=" + rightParentCode + ", rightType=" + rightType
				+ ", rightText=" + rightText + ", rightUrl=" + rightUrl + ", rightTip=" + rightTip + "]";
	}
    
}