package com.Exception.Book;

public class JTC107 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		h1.m1(Integer.parseInt(args[0]));
		h1.m2(Integer.parseInt(args[1]));
	}
}

class Hello{
	int m1(int a) {
		System.out.println("m1 in Hello");
		try {
			System.out.println("In Try of m1");
			int x = 10/a;
			System.out.println("x="+x);
		} catch (Exception e) {
			System.out.println("in catch of m1");
			e.printStackTrace();
		}finally {
			System.out.println("in finally...very important code");
		}
		System.out.println("after catch block in m1");
		return 99;
	}
	int m2(int a) {
		System.out.println("m2(int a) in Hello");
		try {
			System.out.println("in m2(int a) try block");
			int x = 10/a;
			System.out.println("x="+x);
			return 10;
		}catch(ArithmeticException e) {
			System.out.println("in catch of m2");
			e.printStackTrace();
		}finally {
			System.out.println("very imp code in finally of m2");
		}
		System.out.println("out of catch in m2");
		return 20;
	}
}
