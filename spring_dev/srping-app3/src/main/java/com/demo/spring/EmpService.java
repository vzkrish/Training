package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmpDao dao; 
	
	/*public void setEmpDao(EmpDao dao)
	{
	   this.dao=dao;	
	}*/
	
	public String regsiterEmp(int EmpID, String EmpName, String EmpCity, double salary)
	{
		String resp = dao.SaveMe(new Emp(EmpID, EmpName, EmpCity, salary));
		return resp;
	}

}
