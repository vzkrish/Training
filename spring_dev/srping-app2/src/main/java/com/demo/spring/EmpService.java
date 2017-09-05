package com.demo.spring;

public class EmpService {
	
	EmpDao dao; 
	
	public void setEmpDao(EmpDao dao)
	{
	   this.dao=dao;	
	}
	
	public String regsiterEmp(int EmpID, String EmpName, String EmpCity, double salary)
	{
		String resp = dao.SaveMe(new Emp(EmpID, EmpName, EmpCity, salary));
		return resp;
	}

}
