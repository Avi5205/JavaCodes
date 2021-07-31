package com.OOPS.WorkBook;

public class JTC10 {

	public static void main(String[] args) {
		System.out.println("**MAIN METHOD**");
		System.out.println(MNO1.VAL);
		System.out.println(MNO1.VAL + 100);
	}
}

class MNO1 {
	final static int VAL = 9090;
	static {
		System.out.println("**STATIC BLOCK OF MNO\t:" + VAL);
	}
}