package com.wxl.common;

public class Conditions {
	
	private Integer currPage;
	
	private String startTime;
	private String endTime;
	
	
	private String time;
	private String cnt;
	
	
	private String sort;


	public Integer getCurrPage() {
		return currPage;
	}


	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getCnt() {
		return cnt;
	}


	public void setCnt(String cnt) {
		this.cnt = cnt;
	}


	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}


	public Conditions(String startTime, String endTime, String time, String cnt, String sort) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.time = time;
		this.cnt = cnt;
		this.sort = sort;
	}


	public Conditions() {
		super();
	}


	@Override
	public String toString() {
		return "Conditions [startTime=" + startTime + ", endTime=" + endTime + ", time=" + time + ", cnt=" + cnt
				+ ", sort=" + sort + "]";
	}
	
	
}
