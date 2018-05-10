package com.aravind.restapp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aravind.restapp.model.Employee;
import com.aravind.restapp.service.EmployeeService;

/**
 * Controller class for Employee resource. This is the front-end to receieve all
 * REST calls to "/employees" endpoint
 * 
 * @author Aravind
 *
 */
@Path("/employees")
public class EmployeeController {

    private EmployeeService empService = new EmployeeService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Employee> getAllEmployees() {
	return empService.getAllEmployees();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{empNo}")
    public Employee getEmployeeById(@PathParam("empNo") int empNo) {
	return empService.getEmployee(empNo);
    }

}
