package com.Lang.WorkBook;

public class JTC9{

	public static void main(String[] args){
		String st1 = "JTC";
		String st2 = "JTC";
		String st3 = new String("JTC");
		String st4 = "JTC";
		
		System.out.println(st1+"\t"+st2+"\t"+st3+"\t"+st4);
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equalsIgnoreCase(st4));
		System.out.println("***************");

		int ab = 94;
		int bc = 76;
		int res = ab-bc;

		System.out.println(res); //18
		System.out.println("ABC".compareTo("ABC"));//0
		System.out.println("AEC".compareTo("ABC"));//3
		System.out.println("ABH".compareTo("ADC"));//-2
		System.out.println("ABC".compareTo("ABCDEFGH"));//-5
		System.out.println("ABC".compareTo("ABMDEFGH"));//-10
		System.out.println("ABC".compareTo("Abc"));//-32
		System.out.println("ABC".compareToIgnoreCase("Abc"));//0
		System.out.println("ABC".compareToIgnoreCase("Abg"));//-4
	}
}
