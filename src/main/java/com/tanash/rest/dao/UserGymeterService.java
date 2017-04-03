package com.tanash.rest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tanash.rest.model.HealthMeter;
import com.tanash.rest.util.DBUtility;

public class UserGymeterService {

	private Connection connection;

	public UserGymeterService() {
		connection = DBUtility.getConnection();
	}

	public List<HealthMeter> getAllHealthMeter() {
		List<HealthMeter> hmlist = new ArrayList<HealthMeter>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from health_meter");
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

}
