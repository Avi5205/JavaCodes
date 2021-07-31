package com.Exception.WorkBook;

public class JTC3 {

	public static void main(String[] args) {
		System.out.println("main begin");
		String s = null;
		try {
			s = args[0];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Provide the value");
			System.out.println(e);
		}
		int x = 0;
		try {
			x = Integer.parseInt(s);
			System.out.println(x);
		}catch(NumberFormatException e) {
			System.out.println("Please Provide integer number");
			System.out.println(e);
		}
		try {
			int y = 10/x;
			System.out.println(y);
		}catch(ArithmeticException e) {
			System.out.println("Please Don't Provide Zero");
			System.out.println(e);
		}
		System.out.println("main end");
	}

}
