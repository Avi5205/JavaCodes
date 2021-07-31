package com.OOPS.WorkBook;

public class JTC9 {

	public static void main(String[] args) {
		System.out.println("**MAIN METHOD**");
		new Student();
		System.out.println("--Student Object Created--\n");
		new Employee1();
		System.out.println("--Employee Object Created--\n");
	}
}

class Person{
	static {
		System.out.println("\n--Static of Person--");
	}
	Person(){
		System.out.println("--Person() Cons--");
	}
}

class Student extends Person{
	static {
		System.out.println("--Static of Student--");
	}
	Student(){
		System.out.println("--Student() Cons--");
	}
}

class Employee1 extends Person{
	static {
		System.out.println("--Static of Employee--");
	}
}