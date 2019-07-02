package kr.co.jhta.vo;

import java.sql.Date;

public class Employee {

	public Integer id;
	public String firstName;
	public String lastName;
	public String email;
	public String phone;
	public Date hireDate;
	public String jobId;
	public Double salary;
	public Integer commissionPct;
	public Department managerID;
	public Department locationID;
	
	public Employee() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Integer commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Department getManagerID() {
		return managerID;
	}
	public void setManagerID(Department managerID) {
		this.managerID = managerID;
	}
	public Department getLocationID() {
		return locationID;
	}
	public void setLocationID(Department locationID) {
		this.locationID = locationID;
	}
	

	
	
}
