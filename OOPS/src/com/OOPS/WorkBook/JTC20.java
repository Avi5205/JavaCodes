package com.OOPS.WorkBook;

public class JTC20 {

	public static void main(String[] args) {
		ShapeUtil util = new ShapeUtil();
		util.showShapeInfo(new Square(12.0));
		util.showShapeInfo(new Rectangle(12.0, 10.0));

	}

}
//public class Rectangle extends Shape{
//	double width;
//	Rectangle(double length,double width){
//		super(length);
//		this.width = width;
//	}
//	double findArea() {
//		System.out.println("**Rectangle Find Area**");
//		return length*width;
//	}
//	String getType() {
//		return "Rectangle";
//	}
//	double getWidth() {
//		return width;
//	}
//	static void display() {
//		System.out.println("++Static Display in Rectangle++");
//	}
//}
//public class Square extends Shape{
//	Square(double side){
//		super(side);
//	}
//	double findArea() {
//		System.out.println("**Square Find Area**");
//		return length*length;
//	}
//	double getSide() {
//		return length;
//	}
//	String getType() {
//		return "Square";
//	}
//	static void display() {
//		System.out.println("==Static Display in Square==");
//	}
//}

//public class ShapeUtil{
//	public void showShapeInfo(Shape sp) {
//		System.out.println("\nType\t:"+sp.getType());
//		System.out.println("Length\t:"+sp.getLength());
//		System.out.println("Area\t:"+sp.findArea());
//		sp.display();
////		sp.getSide();
////		sp.getWidth();
//		System.out.println();
//		if(sp instanceof Square) {
//			Square sq = (Square)sp;
//			System.out.println("Side\t:"+sq.getSide());
//			sq.display();
//		}else if(sp instanceof Rectangle) {
//			Rectangle rec = (Rectangle) sp;
//			rec.display();
//			System.out.println("Width\t:"+rec.getWidth());
//		}
//	}
//}
//
//public abstract class Shape{
//	double length;
//	Shape(double length){
//		this.length = length;
//	}
//	final double getLength() {
//		return this.length;
//	}
//	abstract double findArea();
//	abstract String getType();
//	static void display() {
//		System.out.println("--Static Display in Shape--");
//	}
//}