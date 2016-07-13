package com.atguigu.spring.relation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. 创建 Spring 的 IOC 容器
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		System.out.println("car1:" + ctx.getBean("car1"));
		System.out.println("car2:" + ctx.getBean("car2"));
		System.out.println("car3:" + ctx.getBean("car3"));
		// abstract属性的bean无法被实例化
		// 并不是所有的bean属性都会被继承, 比如abstract,比如scope
		// System.out.println("car :" + ctx.getBean("car"));

		System.out.println("person:" + ctx.getBean("person"));

	}

}
