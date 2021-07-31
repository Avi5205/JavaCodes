package com.Lang.WorkBook;

public class JTC10{
	public static void main(String[] args){
		int ab = 10;
		//String st1 = ab;
		//String st2 = (String)ab;
		String st3 = String.valueOf(ab);
		System.out.println(st3);
		boolean b1 = true;
		String st4 = String.valueOf(b1);
		System.out.println(st4);
		long val = 1234L;
		String st5 = String.valueOf(val);
		System.out.println(st5);
		Employee emp1 = null;
		Employee emp2 = new Employee();
		String st6 = String.valueOf(emp1);
		String st7 = String.valueOf(emp2);
		Person p = new Person();
		String st8 = String.valueOf(p);
		System.out.println(st6);
		System.out.println(st7);
		System.out.println(st8);
	}
}

class Employee{}
class Person{
	public String toString(){
		return "Person Obj";
	}
}
