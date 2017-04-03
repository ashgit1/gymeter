package com.tanash.rest.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tanash.rest.dao.UserGymeterService;
import com.tanash.rest.model.HealthMeter;

@Path("/users/")
public class UserGymeterController {

	static final Logger logger = Logger.getLogger(UserGymeterController.class);
	UserGymeterService usergymeterservice = new UserGymeterService();

	@GET
	@Path("/{user_name}/{workout_details}")
	@Produces("text/html")
	public Response getWorkOutDetails(@PathParam("user_name") String userName) {

		System.out.println("getWorkOutDetails() called...");

		List<HealthMeter> userMetrics = usergymeterservice.getAllHealthMeter();
		String userMetricsJson = new Gson().toJson(userMetrics);
		logger.info("json String : " + userMetricsJson);
		System.out.println("json String : " + userMetricsJson);
		
		//return Response.status(200).entity(json).build();
		return Response.ok(userMetricsJson, MediaType.APPLICATION_JSON).build();
	}

}
