package com.ems.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ems.dao.MockedDatabase;
import com.ems.model.Department;
import com.ems.model.Employee;

public class EmployeeService {

	private static Map<Integer, Employee> empMap = MockedDatabase.getEmployees();
	private static int lastEmpNo = 109;

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
	 * @return employee
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

	/**
	 * This will return employees in pages, starting from start with given page size
	 * 
	 * @param start
	 *            the start of the page
	 * @param size
	 *            the page size
	 * @return
	 */
	public List<Employee> getAllEmployeesPaginated(int start, int pageSize) {
		List<Employee> empList = new ArrayList<>();

		int count = 0;
		for (int empno : empMap.keySet()) {
			if (empno < start) {
				continue;
			}

			empList.add(empMap.get(empno));
			count++;

			if (count >= pageSize) {
				break;
			}

		}

		return empList;
	}

	/**
	 * Add an employee to the system.
	 * 
	 * @param emp
	 * @return the newly added Employee
	 */
	public Employee addEmployee(Employee emp) {
		lastEmpNo = lastEmpNo + 1;
		emp.setEmpNo(lastEmpNo);
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}

	public void deleteEmployee(int empNo) {
		empMap.remove(empNo);
	}
}
