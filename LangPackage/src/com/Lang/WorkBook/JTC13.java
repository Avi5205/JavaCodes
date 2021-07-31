package com.Lang.WorkBook;

public class JTC13{

	public static void main(String[] args){
		String st = " Hello JTC Students ";
		System.out.println(st+":\t"+st.length());
		String st1 = st.trim();
		System.out.println(st1+":\t"+st.length());
		System.out.println();
		String str1 = "Hello JTC Students";
		String str2 = "Welcome to All";
		String str = str1.concat(str2);
		System.out.println(str);
		System.out.println();
		String st11 = str.substring(7);
		System.out.println(st11);
		String st12 = str.substring(7,17);
		System.out.println(st12);
		//str.substring(7,2);
		System.out.println(st1.charAt(0));
		System.out.println(st1.charAt(14));
	//	System.out.println(st1.charAt(189));
	}
}
