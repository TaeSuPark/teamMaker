package com.peachBro.teammaker.myinfo.vo;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CareerVO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CareerVO.class);
	 
	String contestId;
	String rule;
	Date startDate;
	Date endDate;
	String isAward;
	String contestName;
	String userId;
	
	public String getContestId() {
		return contestId;
	}
	public void setContestId(String contestId) {
		this.contestId = contestId;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
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
	public String getIsAward() {
		return isAward;
	}
	public void setIsAward(String isAward) {
		this.isAward = isAward;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "CareerVO [contestId=" + contestId + ", rule=" + rule + ", startDate=" + startDate + ", endDate="
				+ endDate + ", isAward=" + isAward + ", contestName=" + contestName + ", userId=" + userId + "]";
	}
	
	
}
