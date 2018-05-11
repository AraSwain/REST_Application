package com.ems.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ems.dao.MockedDatabase;
import com.ems.model.Department;
import com.ems.model.Employee;

/**
 * This is service class for all department operations.
 * 
 * @author Aravind
 *
 */
public class DepartmentService {

    private static Map<Integer, Department> deptMap = MockedDatabase.getDepartments();

    private static int lastDeptNo = 30;

    /**
     * Return all the departments in the system.
     * 
     * @return all the departments
     */
    public List<Department> getAllDepartments() {
	List<Department> deptList = new ArrayList<>();

	for (int deptNo : deptMap.keySet()) {
	    deptList.add(deptMap.get(deptNo));
	}

	return deptList;
    }

    /**
     * Get the department by its deptNo
     * 
     * @param deptNo
     * @return the department
     */
    public Department getDepartment(int deptNo) {

	return deptMap.get(deptNo);
    }

    /**
     * Update the department
     * 
     * @param dept
     * @return the updated department
     */
    public Department createDepartment(Department dept) {
	lastDeptNo += 10;
	dept.setDeptNo(lastDeptNo);
	deptMap.put(dept.getDeptNo(), dept);

	return dept;
    }

    /**
     * Update the department
     * 
     * @param dept
     * @return the updated department
     */
    public Department updateDepartment(Department dept) {
	deptMap.put(dept.getDeptNo(), dept);

	return dept;
    }

    /**
     * Delete the department, given its deptNo
     * 
     * @param deptNo
     */
    public void deleteDepartment(int deptNo) {
	deptMap.remove(deptNo);
    }
}
