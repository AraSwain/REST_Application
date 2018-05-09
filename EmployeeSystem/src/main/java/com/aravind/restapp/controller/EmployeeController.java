package com.aravind.restapp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aravind.restapp.model.Employee;
import com.aravind.restapp.service.EmployeeService;

/**
 * 
 * @author Aravind
 *
 */
@Path("/employee")
public class EmployeeController {
    
    private EmployeeService empService = new EmployeeService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Employee> getEmployees() {
	return empService.getAllEmployees();
	
    }

}
