package com.Generics.WorkBook;

public class JTC6 {
	static public void main(String... args) {
		VarArgsManager ref = new VarArgsManager();
		ref.m1(1234);
		ref.m2(1234);
		ref.mm1(1234);
	}
}

class VarArgsManager {
	void m1(long val) {
		System.out.println("--m1(long)--");
	}

	void m2(int... values) {
		System.out.println("--m2(int...)--");
	}

	void mm1(long val) {
		System.out.println("--mm1(long)--");
	}

	void mm1(int... val) {
		System.out.println("--mm1(int...)--");
	}
}
