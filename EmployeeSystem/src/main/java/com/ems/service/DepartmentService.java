package com.ems.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ems.dao.MockedDatabase;
import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentService {
    
    private static Map<Integer, Department> deptMap = MockedDatabase.getDepartments();

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
