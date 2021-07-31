package com.OOPS.WorkBook;

public abstract class Shape {
	double length;

	Shape(double length) {
		this.length = length;
	}

	final double getLength() {
		return this.length;
	}

	abstract double findArea();

	abstract String getType();

	static void display() {
		System.out.println("--Static Display in Shape--");
	}
}