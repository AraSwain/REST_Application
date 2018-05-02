package com.aravind.restapp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Aravind
 *
 */
@Path("/employee")
public class EmployeeController {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getEmployees() {
	return "Hello World";
    }

}
