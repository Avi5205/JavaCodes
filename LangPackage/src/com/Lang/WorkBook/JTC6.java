package com.Lang.WorkBook;

public class JTC6 {

	public static void main(String[] args) {
		String str1 = "JTC";
		String str2 = "JTC";
		String str3 = "JTC";
		System.out.println(str1+"\t"+str2+"\t"+str3);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println("--------------------");
		String ref1 = new String("JTC");
		String ref2 = new String("JTC");
		System.out.println(ref1+"\t"+ref2);
		System.out.println(ref1 == ref2);
		System.out.println(str1 == ref1);
		System.out.println(str1 == ref2);
		String ref3 = new String("SP");
		String ref4 = new String("SP");
		System.out.println(ref3+"\t"+ref4);
		System.out.println(ref3 == ref4);
	}

}
