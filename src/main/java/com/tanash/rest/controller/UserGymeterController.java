package com.tanash.rest.controller;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tanash.rest.dao.UserGymeterService;
import com.tanash.rest.model.HealthMeter;
import com.tanash.rest.model.WorkOutPlan;

@Path("/users/")
public class UserGymeterController {

	static final Logger logger = Logger.getLogger(UserGymeterController.class);
	UserGymeterService usergymeterservice = new UserGymeterService();

	@GET
	@Path("/{user_name}/workout_details")
	@Produces("text/html")
	public Response getWorkOutDetails(@PathParam("user_name") String userName) {

		System.out.println("getWorkOutDetails() called...");

		List<HealthMeter> userMetrics = usergymeterservice.getAllHealthMeter();
		String userMetricsJson = "{ \"data\": " + new Gson().toJson(userMetrics) + "}";
		logger.info("json String : " + userMetricsJson);
		System.out.println("json String : " + userMetricsJson);

		// return Response.status(200).entity(json).build();
		return Response.ok(userMetricsJson, MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Path("/{user_name}/add/workout_details")
	public Response addWorkOutDetails(@FormParam("date") String date, @FormParam("weight") String weight,
			@FormParam("treadmill_km") String treadmill_km, @FormParam("treadmill_min") String treadmill_min,
			@FormParam("cycling_km") String cycling_km, @FormParam("cyclig_min") String cyclig_min,
			@FormParam("gymset") String gymset) throws ParseException {

		System.out.println("addWorkOutDetails() called...");
		
		HealthMeter hmobj = new HealthMeter();
		java.util.Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(date);
		java.sql.Date gymDate = new java.sql.Date(date1.getTime());
		System.out.println(date + "\t" + gymDate);
		hmobj.setGym_date(gymDate);
		hmobj.setWeight_kg(Double.parseDouble(weight));
		hmobj.setTreadmill_km(Double.parseDouble(treadmill_km));
		hmobj.setTreadmill_time(Integer.parseInt(treadmill_min));
		hmobj.setCycling_km(Double.parseDouble(cycling_km));
		hmobj.setCycling_time(Integer.parseInt(cyclig_min));
		hmobj.setGym_set(gymset);

		/*if (!usergymeterservice.addHealthMeter(hmobj).equals("ERROR")) {
			return Response.status(200)
					.entity("<font color='green'> " + "WorkOut added successfuly!<br> Date: " + date + "<br> weight: "
							+ weight + "<br> treadmill_km: " + treadmill_km + "<br> treadmill_min: " + treadmill_min
							+ "<br> cycling_km: " + cycling_km + "<br> cyclig_min: " + cyclig_min + "<br> gymset: "
							+ gymset + "</font>")
					.build();
		} else {
			return Response.status(200).entity("<font color='red'> Error occured while adding workout details</font>")
					.build();
		}*/
		if (!usergymeterservice.addHealthMeter(hmobj).equals("ERROR")) {
			try {
				java.net.URI location = new java.net.URI("../table.html");
				return Response.temporaryRedirect(location).build();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		} else {
			return Response.status(200).entity("<font color='red'> Error occured while adding workout details</font>")
					.build();
		}
		
		return Response.status(200).entity("Hello Ashish")
				.build();
		
	}
	
	@GET
	@Path("/{user_name}/workout_plan")
	@Produces("text/html")
	public Response getWorkOutPlan(@PathParam("user_name") String userName) {

		System.out.println("getWorkOutPlan() called...");
		System.out.println("User = " + userName);

		List<WorkOutPlan> wopMetrics = usergymeterservice.getWorkOutPlan(userName);
		String wopMetricsJson = "{ \"wopdata\": " + new Gson().toJson(wopMetrics) + "}";
		logger.info("json String : " + wopMetricsJson);
		System.out.println("json String : " + wopMetricsJson);

		// return Response.status(200).entity(json).build();
		return Response.ok(wopMetricsJson, MediaType.APPLICATION_JSON).build();
	}
}