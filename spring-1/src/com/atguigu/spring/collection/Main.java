package com.atguigu.spring.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. ´´½¨ Spring µÄ IOC ÈÝÆ÷
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-collection.xml");
		System.out.println("car1:" + ctx.getBean("group"));
	}

}
