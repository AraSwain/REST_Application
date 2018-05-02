package com.aravind.restapp.model;

import java.util.Date;

/**
 * 
 * @author Aravind
 *
 */
public class Employee {
    private int empNo;
    private String empName;
    private String job;
    private int manager;
    private Date hireDate;
    private double salary;
    private double commission;
    private int deptNo;
    
    public Employee() {
    }
    
    public Employee(int empNo, String empName, String job, int manager, Date hireDate, double salary, double commission,
	    int deptNo) {
	this.empNo = empNo;
	this.empName = empName;
	this.job = job;
	this.manager = manager;
	this.hireDate = hireDate;
	this.salary = salary;
	this.commission = commission;
	this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
	return "Employee [EmpNo=" + empNo + ", EmpName=" + empName + ", Job=" + job + ", Manager=" + manager
		+ ", HireDate=" + hireDate + ", Salary=" + salary + ", Commission=" + commission + ", DeptNo=" + deptNo
		+ "]";
    }   
    
}
