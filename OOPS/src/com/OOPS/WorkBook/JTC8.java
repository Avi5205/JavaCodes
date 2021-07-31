package com.OOPS.WorkBook;

public class JTC8 {

	public static void main(String[] args) {
		System.out.println("**MAIN METHOD**");
		System.out.println(XYZ.var);
		System.out.println("\n--Value Accessed--");
		System.out.println(new XYZ());
	}
}

class XYZ{
	static int var = 123;
	static {
		System.out.println("--Static of XYZ--");
	}
}