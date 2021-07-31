package com.Lang.WorkBook;

public class JTC8 {

	public static void main(String[] args) {
		String st1 = "JTC ";
		String st2 = "India";
		String st3 = st1 + st2;
		String st4 = st1 + "INDIA";
		String st5 = "JTC " + st2;
		System.out.println(st3 + "\t" + st4 + "\t" + st5);
		System.out.println(st3 == st4);
		System.out.println(st3 == st5);
		System.out.println(st4 == st5);
		String st6 = "JTC" + "INDIA";
		final String st7 = "JTC";
		final String st8 = "INDIA";
		String st9 = st7 + st8;
		System.out.println(st6 + "\t" + st9);
		System.out.println(st6 == st9);
		String st10 = "JTCINDIA";
		System.out.println(st6 == st10);

	}

}
