package com.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model class for department
 * 
 * @author Aravind
 *
 */
@XmlRootElement
public class Department {
    private int deptNo;
    private String deptName;
    private String deptLocation;
    
    public Department() {
    }
    
    public Department(int deptNo, String deptName, String deptLocation) {
	this.deptNo = deptNo;
	this.deptName = deptName;
	this.deptLocation = deptLocation;
    }
    
    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptLocation() {
        return deptLocation;
    }
    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    @Override
    public String toString() {
	return "Department [DeptNo=" + deptNo + ", DeptName=" + deptName + ", DeptLocation=" + deptLocation + "]";
    }

}
