package kr.co.jhta.vo;

import java.sql.Date;

public class Customer {
	/*
	CUST_NO	NUMBER(4,0)
	CUST_NAME	VARCHAR2(20 BYTE)
	CUST_NICKNAME	VARCHAR2(20 BYTE)
	CUST_PHONE	VARCHAR2(20 BYTE)
	CUST_EMAIL	VARCHAR2(50 BYTE)
	CUST_ADDRESS	VARCHAR2(50 BYTE)
	CUST_POINT	NUMBER(8,0)
	CUST_CREATE_DATE	DATE*/

	private int no;
	private String name;
	private String nickname;
	private String phone;
	private String email;
	private String address;
	private int point;
	private Date createDate;
	
	public Customer() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
