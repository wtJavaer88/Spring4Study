package com.atguigu.spring.cycle;

public class Car {

	private String company;
	private String brand;

	private int maxSpeed;
	private double price;

	public Car() {
		System.out.println("Cycle car construct.....");
	}

	public Car(String company, double price) {
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", brand=" + brand + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}

	public void start() {
		System.out.println("Cycle car init.....");
	}

	public void destroy() {
		System.out.println("Cycle car destroy.....");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Cycle car setBrand.....");
		this.brand = brand;
	}
}
