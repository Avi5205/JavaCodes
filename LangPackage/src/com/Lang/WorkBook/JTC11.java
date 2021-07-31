package com.Lang.WorkBook;

public class JTC11{
	public static void main(String[] args){
		String str = "Hi This is JTC. Full name Java Training Center. We are providing Best training for Java with Best SylJtcus.Jtc is 		no.1 in Training & placement,Thanks"; 
		System.out.println(str);
		System.out.println(str.startsWith("Hi"));
		System.out.println(str.startsWith("Welcome"));
		System.out.println(str.startsWith("Full"));
		System.out.println(str.startsWith("Full",16));
		System.out.println(str.endsWith("placement"));
		System.out.println(str.endsWith("Thanks"));
		System.out.println("----------------");
		String st1 = str.replace('J','Y');
		System.out.println(st1);
		String st2 = str.replaceAll("Java","XYZ");
		System.out.println(st2);
		String st3 = str.replaceFirst("Java","XYZ");
		System.out.println(st3);
		System.out.println("----------------");
		String st4 = str.toLowerCase();
		String st5 = str.toUpperCase();
		System.out.println(st4);
		System.out.println(st5);
	}
}
