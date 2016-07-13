package com.atguigu.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<String, Car> cars = new HashMap<>();

	public InstanceCarFactory() {
		cars.put("Audi", new Car("audi", 300000));
		cars.put("Ford", new Car("ford", 400000));
	}

	public Car getCar(String name) {
		return cars.get(name);
	}
}
