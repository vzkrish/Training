package com.demo.spring;

import java.util.List;

public interface EmpDao {
	
	public String SaveMe(Emp e);
	public Emp Find(int EmpID); 
	public List<Emp> getEmpList(); 
	public String delete(int EmpID);
	public String update(Emp e);
}

