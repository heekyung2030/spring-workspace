package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Department;

public class DepartmentDao {

	@Autowired    //SqlMapClientTemplate찾아서 주입될수 있게 함
	private SqlMapClientTemplate template;
	
	public List<Department> getAllDepartments(){
		return template.queryForList("getAllDepartments");
	}
	
	public  Department getEmployeeByDepartmentId(int id) {
		return (Department) template.queryForObject("getEmployeeByDepartmentId",id);
	}
	
}
