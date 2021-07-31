package com.OOPS.WorkBook;

public class JTC7 {

	public static void main(String[] args) {
		System.out.println("**MAIN METHOD**");
		TestClasses cl = null;
		System.out.println("--Ref Created--\n");
		cl = new TestClasses();
		System.out.println(cl);
	}
}

class TestClasses{
	static {
		System.out.println("--Static of TestClasses--");
	}
	TestClasses(){
		System.out.println("--TestClasses() Cons--");
	}
}