package com.demo.spring;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoJdbcImp implements EmpDao{

	@Override
	public String SaveMe(Emp e) {
		// TODO Auto-generated method stub
		return "JDBC: Emp Registered   " + e.getEmpCity() +"   " +  e.getEmpName() +"   " + e.getSalary() ;
	}

	@Override
	public Emp Find(int EmpID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int EmpID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

}
