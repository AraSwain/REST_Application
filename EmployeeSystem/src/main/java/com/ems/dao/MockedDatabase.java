package com.ems.dao;

import java.util.HashMap;
import java.util.Map;

import com.ems.model.Department;
import com.ems.model.Employee;

public class MockedDatabase {
	static Map<Integer, Employee> empMap = new HashMap<>();
	static Map<Integer, Department> deptMap = new HashMap<>();

	public static Map<Integer, Department> getDepartments() {
		deptMap = loadDeptData();
		return deptMap;
	}

	public static Map<Integer, Employee> getEmployees() {
		empMap = loadEmployeeData();
		return empMap;
	}

	// load some data
	private static Map<Integer, Employee> loadEmployeeData() {
		Map<Integer, Employee> empMap = new HashMap<>();

		empMap.put(100, new Employee(100, "Byomkesh Bauxi", "Director", 100, 55000.00, 8600.00, 10));
		empMap.put(101, new Employee(101, "Bimal Mishra", "Manager", 100, 45000.00, 4400.00, 10));
		empMap.put(102, new Employee(102, "Rahul Pati", "Developer", 100, 35000.00, 3600.00, 20));
		empMap.put(103, new Employee(103, "Rakesh Sahu", "Tester", 100, 25000.00, 2000.00, 10));
		empMap.put(104, new Employee(104, "Debadatta Sahoo", "Developer", 100, 46000.00, 4000.00, 20));
		empMap.put(105, new Employee(105, "Bijay Ray", "Developer", 100, 36000.00, 2100.00, 10));
		empMap.put(106, new Employee(106, "Binay Panda", "Tester", 100, 26000.00, 1800.00, 20));
		empMap.put(107, new Employee(107, "Shantanu Bhoi", "Tester", 100, 47000.00, 3300.00, 20));
		empMap.put(108, new Employee(108, "Champak Hati", "Developer", 100, 37000.00, 2800.00, 30));
		empMap.put(109, new Employee(109, "Harish Prakash", "Tester", 100, 27000.00, 2200.00, 20));
		empMap.put(110, new Employee(109, "Harish Nanda", "Manager", 100, 27000.00, 2200.00, 30));
		empMap.put(111, new Employee(109, "Ramesh Kumar", "Tester", 100, 27000.00, 2200.00, 20));
		empMap.put(112, new Employee(109, "Paresh Sahu", "Tester", 100, 27000.00, 2200.00, 30));
		empMap.put(113, new Employee(109, "Krishna Nanda", "Developer", 100, 27000.00, 2200.00, 20));
		empMap.put(114, new Employee(109, "Rahul H", "Tester", 100, 27000.00, 2200.00, 30));
		empMap.put(115, new Employee(109, "Ravi Nanda", "Tester", 100, 27000.00, 2200.00, 20));
		empMap.put(116, new Employee(109, "Ashish P", "Developer", 100, 27000.00, 2200.00, 30));
		empMap.put(117, new Employee(109, "Fanindra Sa", "Tester", 100, 27000.00, 2200.00, 10));
		empMap.put(118, new Employee(109, "Balmiki K", "Developer", 100, 27000.00, 2200.00, 30));
		empMap.put(119, new Employee(109, "Venkatesh Naidu", "Developer", 100, 27000.00, 2200.00, 30));
		empMap.put(120, new Employee(109, "Rozy Nanda", "Manager", 100, 27000.00, 2200.00, 30));
		empMap.put(121, new Employee(109, "Arati S", "Tester", 100, 27000.00, 2200.00, 30));
		empMap.put(122, new Employee(109, "Trupthi Pradhan", "Tester", 100, 27000.00, 2200.00, 10));
		empMap.put(123, new Employee(109, "Harish Saha", "Developer", 100, 27000.00, 2200.00, 30));
		empMap.put(124, new Employee(109, "Shahrukh Shah", "Tester", 100, 27000.00, 2200.00, 20));
		empMap.put(125, new Employee(109, "Harish Nanda", "Developer", 100, 27000.00, 2200.00, 10));
		empMap.put(126, new Employee(109, "Om Puri", "Tester", 100, 26000.00, 2200.00, 30));
		empMap.put(127, new Employee(109, "Salman Khan", "Tester", 100, 23000.00, 2200.00, 30));
		empMap.put(128, new Employee(109, "Harish Nanda", "Tester", 100, 24000.00, 2200.00, 10));
		empMap.put(129, new Employee(109, "Hari D", "Developer", 100, 37000.00, 2200.00, 20));
		empMap.put(130, new Employee(109, "Ankur S", "Developer", 100, 27000.00, 2200.00, 10));

		return empMap;
	}

	private static Map<Integer, Department> loadDeptData() {
		Map<Integer, Department> deptMap = new HashMap<>();

		deptMap.put(10, new Department(10, "AppDevelopment", "Bangalore"));
		deptMap.put(20, new Department(20, "MobileDevelopment", "Hyderabad"));
		deptMap.put(30, new Department(30, "GraphicsDesign", "Bangalore"));
		deptMap.put(40, new Department(40, "NewDepartment", "Chennai"));

		return deptMap;
	}
}
