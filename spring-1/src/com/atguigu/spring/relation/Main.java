package com.atguigu.spring.relation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. ���� Spring �� IOC ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		System.out.println("car1:" + ctx.getBean("car1"));
		System.out.println("car2:" + ctx.getBean("car2"));
		System.out.println("car3:" + ctx.getBean("car3"));
		// abstract���Ե�bean�޷���ʵ����
		// ���������е�bean���Զ��ᱻ�̳�, ����abstract,����scope
		// System.out.println("car :" + ctx.getBean("car"));

		System.out.println("person:" + ctx.getBean("person"));

	}

}
