package com.atguigu.spring.beanfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. ���� Spring �� IOC ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-beanfactory.xml");
		System.out.println("car1:" + ctx.getBean("car"));
	}

}
