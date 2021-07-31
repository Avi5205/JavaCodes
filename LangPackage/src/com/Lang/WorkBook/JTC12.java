package com.Lang.WorkBook;

public class JTC12{
	public static void main(String[] args){
	
		String str = "Hi This is JTC. Full name Java Training Center. We are providing Best training for java with Best Syllabus.Jtc is no.1 in Training & placement,Thanks.";
		System.out.println(str.indexOf('X'));
		System.out.println(str.indexOf('J'));
		System.out.println(str.indexOf('J',11));
		System.out.println(str.indexOf('J',12));
		System.out.println(str.indexOf('J',27));
		System.out.println();
		System.out.println(str.indexOf("XYZ"));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Java",26));
		System.out.println("-----------");
		System.out.println(str.lastIndexOf('J'));
		System.out.println(str.lastIndexOf('J',120));
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.lastIndexOf("Java",120));
		System.out.println(str.lastIndexOf("Java",15));

	}
}
