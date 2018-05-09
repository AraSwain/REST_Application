package com.aravind.restapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aravind.restapp.model.Department;
import com.aravind.restapp.model.Employee;

public class DepartmentService {
    
    private Map<Integer, Department> deptMap = new HashMap<>();

    public DepartmentService() {
	init();
    }
    
    public void init() {
	deptMap = DataLoader.loadDeptData();
    }
    
    public List<Department> getAllDepartments() {

	List<Department> deptList = new ArrayList<>();
	
	for(int deptNo : deptMap.keySet()) {
	    deptList.add(deptMap.get(deptNo));
	}
	
	return deptList;
    }

    public Department getDepartment(int deptNo) {

	return deptMap.get(deptNo);
    }
}
