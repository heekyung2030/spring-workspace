package com.sample.di.demo5;

public class UserService {

	private UserDao userdao;
	private PointDao pointdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	public void setPointdao(PointDao pointdao) {
		this.pointdao = pointdao;
	}
	
	void addNewUser(String name, String id, String password) {
		userdao.insertUser(name, id, password);
		pointdao.updatePoint(id, 10);
	}
}
