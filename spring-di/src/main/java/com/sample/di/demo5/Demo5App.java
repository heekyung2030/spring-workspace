package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5App {
	
	public static void main(String[] args) {
		String resource="classpath:/com/sample/di/demo5/demo5 b    .xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		UserService user=ctx.getBean("userService", UserService.class);
		
		user.addNewUser("고길동", "go", "zxcv1234");
	}

}
