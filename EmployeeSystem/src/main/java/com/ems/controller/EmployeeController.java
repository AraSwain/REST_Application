package com.ems.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

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
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployees() {
	return empService.getAllEmployees();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{empNo}")
    public Employee getEmployeeById(@PathParam("empNo") int empNo) {
	return empService.getEmployee(empNo);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee addEmployee(Employee emp) {
	return empService.addEmployee(emp);
    }

    @PUT
    @Path("{empNo}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(@PathParam("empNo") int eno, Employee emp) {
	emp.setEmpNo(eno);
	return empService.updateEmployee(emp);
    }

    @DELETE
    @Path("{empNo}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteEmployee(@PathParam("empNo") int eno) {
	empService.deleteEmployee(eno);
	return "Employee with id " + eno + " deleted successfully !";
    }
    
}
