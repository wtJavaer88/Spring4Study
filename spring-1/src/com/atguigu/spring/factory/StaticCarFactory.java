package com.atguigu.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	private static Map<String, Car> cars = new HashMap<>();
	static {
		cars.put("Audi", new Car("audi", 300000));
		cars.put("Ford", new Car("ford", 400000));
	}

	public static Car getCar(String name) {
		return cars.get(name);
	}
}
