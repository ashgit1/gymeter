package com.tanash.rest.model;

import java.sql.Date;

public class HealthMeter {

	private int record_id;
	private Date gym_date;
	private double weight_kg;
	private double treadmill_km;
	private int treadmill_time;
	private double cycling_km;
	private int cycling_time;
	private String gym_set;

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public Date getGym_date() {
		return gym_date;
	}

	public void setGym_date(Date gym_date) {
		this.gym_date = gym_date;
	}

	public double getWeight_kg() {
		return weight_kg;
	}

	public void setWeight_kg(double weight_kg) {
		this.weight_kg = weight_kg;
	}

	public double getTreadmill_km() {
		return treadmill_km;
	}

	public void setTreadmill_km(double treadmill_km) {
		this.treadmill_km = treadmill_km;
	}

	public int getTreadmill_time() {
		return treadmill_time;
	}

	public void setTreadmill_time(int treadmill_time) {
		this.treadmill_time = treadmill_time;
	}

	public double getCycling_km() {
		return cycling_km;
	}

	public void setCycling_km(double cycling_km) {
		this.cycling_km = cycling_km;
	}

	public int getCycling_time() {
		return cycling_time;
	}

	public void setCycling_time(int cycling_time) {
		this.cycling_time = cycling_time;
	}

	public String getGym_set() {
		return gym_set;
	}

	public void setGym_set(String gym_set) {
		this.gym_set = gym_set;
	}

	@Override
	public String toString() {
		return "Health-Meter [record_id=" + record_id + ", gym_date=" + gym_date + ", weight_kg=" + weight_kg
				+ ", treadmill_km=" + treadmill_km + ", treadmill_time=" + treadmill_time + ", cycling_km=" + cycling_km
				+ ", cycling_time=" + cycling_time + ", gym_set=" + gym_set + "]";
	}

}