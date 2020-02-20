package com.wxl.common;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

public class Conditions {
	
	private Integer currPage=1;
	
	private String startTime;
	private String endTime;
	
	private String sel;
	
	private String sort;
	@Override
	public String toString() {
		return "Conditions [currPage=" + currPage + ", startTime=" + startTime + ", endTime=" + endTime + ", sel=" + sel
				+ ", sort=" + sort + "]";
	}




	public Conditions(Integer currPage, String startTime, String endTime, String sel, String sort) {
		super();
		this.currPage = currPage;
		this.startTime = startTime;
		this.endTime = endTime;
		this.sel = sel;
		this.sort = sort;
	}


	public String getSel() {
		return sel;
	}


	public void setSel(String sel) {
		this.sel = sel;
	}








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




	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}





	public Conditions() {
		super();
	}


	
}
