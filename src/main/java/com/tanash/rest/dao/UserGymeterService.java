package com.tanash.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tanash.rest.model.HealthMeter;
import com.tanash.rest.model.WorkOutPlan;
import com.tanash.rest.util.DBUtility;

public class UserGymeterService {

	private Connection connection;
	private Statement statement;
	private ResultSet rs;
	private PreparedStatement preparedStmt;
	WorkOutPlan wop;
	List<WorkOutPlan> wopList;

	public UserGymeterService() {
		connection = DBUtility.getConnection();
	}

	public List<HealthMeter> getAllHealthMeter() {
		List<HealthMeter> hmlist = new ArrayList<HealthMeter>();
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from health_meter");
			while (rs.next()) {
				HealthMeter hm = new HealthMeter();
				hm.setRecord_id(rs.getInt("record_id"));
				hm.setGym_date(rs.getDate("gym_date"));
				hm.setWeight_kg(rs.getDouble("weight_kg"));
				hm.setTreadmill_km(rs.getDouble("treadmill_km"));
				hm.setTreadmill_time(rs.getInt("treadmill_time"));
				hm.setCycling_km(rs.getDouble("cycling_km"));
				hm.setCycling_time(rs.getInt("cycling_time"));
				hm.setGym_set(rs.getString("gym_set"));
				hmlist.add(hm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return hmlist;
	}
	
	public String addHealthMeter(HealthMeter hmobj){
		String MESSAGE=null;;
		try{
			String query = "insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set) "
							+ " values(?, ?, ?, ?, ?, ?, ?)";
			preparedStmt  = connection.prepareStatement(query);
			preparedStmt.setDate(1, hmobj.getGym_date());
			preparedStmt.setDouble(2, hmobj.getWeight_kg());
			preparedStmt.setDouble(3,  hmobj.getTreadmill_km());
			preparedStmt.setInt(4, hmobj.getTreadmill_time());
			preparedStmt.setDouble(5, hmobj.getCycling_km());
			preparedStmt.setInt(6, hmobj.getCycling_time());
			preparedStmt.setString(7, hmobj.getGym_set());
			
			int result = preparedStmt.executeUpdate();
			if(result==1){
				MESSAGE = "User Workout Details Added Successfully !!!";
			}else{
				MESSAGE = "ERROR";
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return MESSAGE;
	}
	
	public List<WorkOutPlan> getWorkOutPlan(String user) {
		wopList = new ArrayList<WorkOutPlan>();
		try {
			String query = "select * from work_out_plan where user_name = ?";
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, user);
			rs = preparedStmt.executeQuery();
			while (rs.next()) {
				wop = new WorkOutPlan();
				wop.setRecord_id(rs.getInt("record_id"));
				wop.setDay_of_week(rs.getString("day_of_week"));
				wop.setWo_desc(rs.getString("wo_desc"));
				wopList.add(wop);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return wopList;
	}

}