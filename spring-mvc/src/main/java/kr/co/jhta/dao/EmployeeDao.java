package kr.co.jhta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SqlMapClientTemplate template;
	
	public void addEmployee(Employee employee){
		template.insert("addEmployee",employee);
	}
	
	public Employee getEmployeeById(int id) {
		return (Employee)template.queryForObject("getEmployeeById",id);
	}

	
}
