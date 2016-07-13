package com.atguigu.spring.beanfactory;

public class Car {

	private String company;
	private String brand;

	private int maxSpeed;
	private double price;

	public Car(String company, double price) {
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", brand=" + brand + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}
}
