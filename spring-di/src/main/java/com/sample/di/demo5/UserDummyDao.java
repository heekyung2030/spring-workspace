package com.sample.di.demo5;

public class UserDummyDao implements UserDao{
	public void insertUser(String name, String id, String password) {
		System.out.println("회원등록");
		
	}
}
