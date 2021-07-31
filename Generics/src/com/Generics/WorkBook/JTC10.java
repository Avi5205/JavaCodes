package com.Generics.WorkBook;

public class JTC10 {

	public static void main(String[] args) {
		BoxingLoading.m1(123);
		BoxingLoading.m2(123);

	}

}

class BoxingLoading {
	static void m1(long val) {
		System.out.println("--m1(long)--");
	}

	static void m1(Integer in) {
		System.out.println("--m1(Integer)--");
	}

	static void m2(int... is) {
		System.out.println("--m2(int...)--");
	}

	static void m2(Integer val) {
		System.out.println("--m2(Integer)--");
	}
}