package com.Exception.Book;

public class JTC108 {

	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		int i = h1.m1();
		System.out.println(i);
	}
}

class Hello1{
	@SuppressWarnings("finally")
	int m1() {
		System.out.println("m1 in Hello");
		try {
			int x = 10/0;
			System.out.println(x);
			return 10;
		}catch(Exception e) {
			e.printStackTrace();
			return 20;
		}finally {
			System.out.println("in finally");
			return 30;
		}
	}
}