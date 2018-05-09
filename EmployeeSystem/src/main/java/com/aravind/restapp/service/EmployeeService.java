package com.aravind.restapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aravind.restapp.model.Department;
import com.aravind.restapp.model.Employee;

public class EmployeeService {
    
    private Map<Integer, Employee> empMap = new HashMap<>();

    public EmployeeService() {
	init();
    }
    
    public void init() {
	empMap = DataLoader.loadEmployeeData();
    }
    
    public List<Employee> getAllEmployees() {

	List<Employee> empList = new ArrayList<>();
	
	for(int empId : empMap.keySet()) {
	    empList.add(empMap.get(empId));
	}
	
	return empList;
    }

    public Employee getEmployee(int empId) {

	return empMap.get(empId);
    }

    public List<Employee> getAllEmployeesInADept() {

	return null;
    }
}
