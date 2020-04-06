package com.hr.util;

import java.util.Date;

public class HumanFileCase {
	// majorKindId majorId first_Kind_Id second_Kind_Id third_Kind_Id
	private Integer majorKindId;
	private Integer majorId;
	private Integer first_Kind_Id;
	private Integer second_Kind_Id;
	private Integer third_Kind_Id;
	private Date begin;
	private Date finish;
	private Integer status;
	
	

	public Integer getMajorKindId() {
		return majorKindId;
	}

	public void setMajorKindId(Integer majorKindId) {
		this.majorKindId = majorKindId;
	}

	public Integer getMajorId() {
		return majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public Integer getFirst_Kind_Id() {
		return first_Kind_Id;
	}

	public void setFirst_Kind_Id(Integer first_Kind_Id) {
		this.first_Kind_Id = first_Kind_Id;
	}

	public Integer getSecond_Kind_Id() {
		return second_Kind_Id;
	}

	public void setSecond_Kind_Id(Integer second_Kind_Id) {
		this.second_Kind_Id = second_Kind_Id;
	}

	public Integer getThird_Kind_Id() {
		return third_Kind_Id;
	}

	public void setThird_Kind_Id(Integer third_Kind_Id) {
		this.third_Kind_Id = third_Kind_Id;
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
		return "HumanFileCase [majorKindId=" + majorKindId + ", majorId=" + majorId + ", first_Kind_Id=" + first_Kind_Id
				+ ", second_Kind_Id=" + second_Kind_Id + ", third_Kind_Id=" + third_Kind_Id + ", begin=" + begin
				+ ", finish=" + finish + ", status=" + status + "]";
	}

}
