package com.aravind.restapp.service;

import java.util.HashMap;
import java.util.Map;

import com.aravind.restapp.model.Department;
import com.aravind.restapp.model.Employee;

/**
 * This class will load some sample data to a map, which acts as a DAO
 * 
 * @author Aravind
 *
 */
public class DataLoader {

    public static Map<Integer, Employee> loadEmployeeData() {
	 Map<Integer, Employee> empMap = new HashMap<>();
	 
	 empMap.put(100, new Employee(100, "Byomkesh Bauxi", "Director", 100, 55000.00, 8600.00, 10));
	 empMap.put(101, new Employee(101, "Bimal Mishra", "Manager", 100, 45000.00, 4400.00, 10));
	 empMap.put(102, new Employee(102, "Rahul Pati", "Developer", 100, 35000.00, 3600.00, 10));
	 empMap.put(103, new Employee(103, "Rakesh Sahu", "Tester", 100, 25000.00, 2000.00, 10));
	 empMap.put(104, new Employee(104, "Debadatta Sahoo", "Manager", 100, 46000.00, 4000.00, 20));
	 empMap.put(105, new Employee(105, "Bijay Ray", "Developer", 100, 36000.00, 2100.00, 20));
	 empMap.put(106, new Employee(106, "Binay Panda", "Tester", 100, 26000.00, 1800.00, 20));
	 empMap.put(107, new Employee(107, "Shantanu Bhoi", "Manager", 100, 47000.00, 3300.00, 30));
	 empMap.put(108, new Employee(108, "Champak Hati", "Developer", 100, 37000.00, 2800.00, 30));
	 empMap.put(109, new Employee(109, "Harish Nanda", "Tester", 100, 27000.00, 2200.00, 30));
	
	 return empMap;
    }

    public static Map<Integer, Department> loadDeptData() {
	Map<Integer, Department> deptMap = new HashMap<>();
	
	deptMap.put(10, new Department(10, "AppDevelopment", "Bangalore"));
	deptMap.put(20, new Department(20, "MobileDevelopment", "Hyderabad"));
	deptMap.put(30, new Department(30, "GraphicsDesign", "Bangalore"));
	
	return deptMap;
    }
}
