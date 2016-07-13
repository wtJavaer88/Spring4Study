package com.atguigu.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");

		Car car1 = ctx.getBean("car", Car.class);
		System.out.println(car1);

		// 关闭IOC容器, 触发destroy销毁方法
		ctx.close();
	}
}
