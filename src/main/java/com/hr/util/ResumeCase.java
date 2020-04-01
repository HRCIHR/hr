package com.hr.util;

import java.util.Date;

public class ResumeCase {

	private Integer MajorId;
	private String keyword;
	private Date begin;
	private Date finish;
	private Integer status;

	public Integer getMajorId() {
		return MajorId;
	}

	public void setMajorId(Integer majorId) {
		MajorId = majorId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResumeCase [MajorId=" + MajorId + ", keyword=" + keyword + ", begin=" + begin + ", finish=" + finish
				+ ", status=" + status + "]";
	}

}
