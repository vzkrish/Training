package com.demo.spring;

public class Emp {
	private int EmpId; 
	private String EmpName;
	private String EmpCity;
	private double Salary;
	public Emp(int empID2, String empName2, String empCity2, double salary2) {
		EmpId = empID2;
		EmpName = empName2;
		EmpCity = empCity2;
		Salary = salary2;
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	
	

}

