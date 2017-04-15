package com.tanash.rest.model;

public class WorkOutPlan {

	private int record_id;
	private String user_name;
	private String day_of_week;
	private String wo_desc;

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	public String getWo_desc() {
		return wo_desc;
	}

	public void setWo_desc(String wo_desc) {
		this.wo_desc = wo_desc;
	}

	@Override
	public String toString() {
		return "Health-Meter [record_id=" + record_id + ", user_name=" + user_name + ", day_of_week=" + day_of_week
				+ ", wo_desc=" + wo_desc + "]";
	}

}