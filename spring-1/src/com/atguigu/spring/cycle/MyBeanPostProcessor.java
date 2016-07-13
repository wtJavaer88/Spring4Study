package com.atguigu.spring.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Cycle postProcessAfterInitialization....Bean:" + arg0);
		if (arg0 instanceof Car) {
			return new Car("AAA", 100);
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Cycle postProcessBeforeInitialization....Bean:" + arg0);
		if (arg0 instanceof Car) {
			return new Car("AAA", 100);
		}
		return arg0;
	}

}
