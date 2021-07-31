package com.OOPS.WorkBook;

public class Rectangle extends Shape {
	double width;

	Rectangle(double length, double width) {
		super(length);
		this.width = width;
	}

	double findArea() {
		System.out.println("**Rectangle Find Area**");
		return length * width;
	}

	String getType() {
		return "Rectangle";
	}

	double getWidth() {
		return width;
	}

	static void display() {
		System.out.println("++Static Display in Rectangle++");
	}
}