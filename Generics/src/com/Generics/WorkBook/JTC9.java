package com.Generics.WorkBook;

public class JTC9 {

	public static void main(String[] args) {
		BoxingService.m1(123);
		BoxingService.m2(123);
		BoxingService.m2(123);

	}

}

class BoxingService {
	static void m1(long val) {
		System.out.println("--m1(long)--");
	}

	static void m2(int... is) {
		System.out.println("--m2(int...)--");
	}

	static void m2(Integer in) {
		System.out.println("--m2(Integer)--");
	}
}