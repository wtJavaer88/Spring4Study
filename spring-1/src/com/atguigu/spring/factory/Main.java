package com.atguigu.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");

		Car car1 = ctx.getBean("car1", Car.class);
		Car car2 = ctx.getBean("car2", Car.class);
		System.out.println(car1);
		System.out.println(car2);

	}
}
