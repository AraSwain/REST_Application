package com.ems.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;

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
    @Produces(MediaType.APPLICATION_JSON)
    public List<Department> getAllDepartments() {
	return deptService.getAllDepartments();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{deptNo}")
    public Department getAllDepartments(@PathParam("deptNo") int deptNo) {
	return deptService.getDepartment(deptNo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{deptNo}/employees")
    public List<Employee> getAllEmployeesInADepartment(@PathParam("deptNo") int deptNo) {
	return empService.getAllEmployeesInADepartment(deptNo);
    }
}
