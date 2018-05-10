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

    /**
     * This method will give all the employees present in the system
     * 
     * @return list of employees
     */
    public List<Employee> getAllEmployees() {
	List<Employee> empList = new ArrayList<>();

	for (int empId : empMap.keySet()) {
	    empList.add(empMap.get(empId));
	}

	return empList;
    }

    /**
     * This method will the employee details by its id
     * 
     * @param empId
     * @return employee details
     */
    public Employee getEmployee(int empId) {
	return empMap.get(empId);
    }

    /**
     * This method will return all the employees in a department.
     * 
     * @param deptNo
     *            the dept no for which we want to retrieve employees
     * @return employee list
     */
    public List<Employee> getAllEmployeesInADepartment(int deptNo) {
	List<Employee> empList = new ArrayList<>();
	Employee emp = null;

	for (int dno : empMap.keySet()) {
	    emp = empMap.get(dno);
	    if (emp.getDeptNo() == deptNo) {
		empList.add(emp);
	    }
	}

	return empList;
    }
}
