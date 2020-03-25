package com.hr.entity;

public class ConfigFileThirdKind {
	private Integer thirdKindId;

	private String thirdKindName;

	private Integer firstKindId;

	private Integer secondKindId;

	private String thirdKindSaleId;

	private String thirdKindIsRetail;

	/*
	 * 不知是否合理 做一个注释 方便后期修改 一级===>多个二级 二级======》 多个一级 如果反过来就相反 所有 当前表拥有 一级id便不再级联查
	 * 增加绒错率
	 */
	private ConfigFileFirstKind configFileFirstKind;

	private ConfigFileSecondKind configFileSecondKind;

	@Override
	public String toString() {
		return "ConfigFileThirdKind [thirdKindId=" + thirdKindId + ", thirdKindName=" + thirdKindName + ", firstKindId="
				+ firstKindId + ", secondKindId=" + secondKindId + ", thirdKindSaleId=" + thirdKindSaleId
				+ ", thirdKindIsRetail=" + thirdKindIsRetail + ", configFileFirstKind=" + configFileFirstKind
				+ ", configFileSecondKind=" + configFileSecondKind + "]";
	}

	public ConfigFileFirstKind getConfigFileFirstKind() {
		return configFileFirstKind;
	}

	public void setConfigFileFirstKind(ConfigFileFirstKind configFileFirstKind) {
		this.configFileFirstKind = configFileFirstKind;
	}

	public ConfigFileSecondKind getConfigFileSecondKind() {
		return configFileSecondKind;
	}

	public void setConfigFileSecondKind(ConfigFileSecondKind configFileSecondKind) {
		this.configFileSecondKind = configFileSecondKind;
	}

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