package com.peachBro.teammaker.search.vo;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchVO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchVO.class);
	 
	int contestId;
	int contestField;
	String contestName;
	String contents;
	Date startDate;
	Date endDate;
	String imageName;
	
	public int getContestId() {
		return contestId;
	}
	public void setContestId(int contestId) {
		this.contestId = contestId;
	}
	public int getContestField() {
		return contestField;
	}
	public void setContestField(int contestField) {
		this.contestField = contestField;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "SearchVO [contestId=" + contestId + ", contestField=" + contestField + ", contestName=" + contestName
				+ ", contents=" + contents + ", startDate=" + startDate + ", endDate=" + endDate + ", imageName="
				+ imageName + "]";
	}
	
	
}
