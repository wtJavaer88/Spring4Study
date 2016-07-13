package com.atguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// proxy();
		aop();

	}

	private static void aop() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");

		System.out.println("arithmeticCalculator:" + arithmeticCalculator.getClass().getName());

		int result = arithmeticCalculator.add(11, 12);
		// System.out.println("result:" + result);

		result = arithmeticCalculator.div(21, 0);
		// System.out.println("result:" + result);

		// HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		// helloWorld.mock(100, 200);
	}

	/**
	 * 使用动态代理来实现
	 */
	private static void proxy() {
		ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();

		arithmeticCalculator = new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();

		int result = arithmeticCalculator.add(11, 12);
		System.out.println("result:" + result);

		result = arithmeticCalculator.div(21, 3);
		System.out.println("result:" + result);
	}

}
