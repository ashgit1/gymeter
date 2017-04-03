package com.tanash.rest.controller;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class RESTfulHelloWorld {

	@GET
	@Produces("text/html")
	public Response getStartingPage() {
		String output = "<h1>Hello World!<h1>" + "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString()
				+ "</p<br>";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/{param}")
	@Produces("text/html")
	public Response greetService(@PathParam("param") String name) {
		String output = "<h1>Gymeter welcomes : " + name + " on " + new Date().toString() + "</h1>";
		return Response.status(200).entity(output).build();
	}
}
