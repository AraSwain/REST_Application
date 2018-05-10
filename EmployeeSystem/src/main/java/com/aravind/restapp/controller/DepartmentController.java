package com.aravind.restapp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aravind.restapp.model.Department;
import com.aravind.restapp.model.Employee;
import com.aravind.restapp.service.DepartmentService;
import com.aravind.restapp.service.EmployeeService;

/**
 * 
 * @author Aravind
 *
 */
@Path("/departments")
public class DepartmentController {

    private DepartmentService deptService = new DepartmentService();
    private EmployeeService empService = new EmployeeService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Department> getAllDepartments() {
	return deptService.getAllDepartments();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{deptNo}")
    public Department getAllDepartments(@PathParam("deptNo") int deptNo) {
	return deptService.getDepartment(deptNo);
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{deptNo}/employees")
    public List<Employee> getAllEmployeesInADepartment(@PathParam("deptNo") int deptNo) {
	return empService.getAllEmployeesInADepartment(deptNo);
    }
}
