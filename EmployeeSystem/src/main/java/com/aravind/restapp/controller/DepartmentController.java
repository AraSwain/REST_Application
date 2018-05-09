package com.aravind.restapp.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aravind.restapp.model.Department;
import com.aravind.restapp.service.DepartmentService;

/**
 * 
 * @author Aravind
 *
 */
@Path("/dept")
public class DepartmentController {
    
    private DepartmentService deptService = new DepartmentService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Department> getAllDepartments() {
	return deptService.getAllDepartments();

    }
}
