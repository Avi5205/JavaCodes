package com.Generics.WorkBook;

public class JTC11 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studId = "JTC-001";
		stud.studId = 1234; // Auto Boxing
		stud.studId = 1234L; // Auto Boxing
		Student stud2 = new Student();
		stud2.studId = "JTC-002";
		stud2.studId = 1234; // Auto Boxing
		stud2.studId = 1234L; // Auto Boxing

		Student<String> st3 = new Student<String>();
		st3.studId = "WB-001";
//		st3.studId = 4512L;

		Student<Long> st4 = new Student<Long>();
//		st4.studId = "WB-001";
		st4.studId = 4512L;
//		st4.studId = 4512;

		Student<?> st5 = new Student<Long>();
		st5 = new Student<String>();
		st5 = new Student<Integer>();

		Student<? extends Number> st6 = new Student<Long>();
//		st6 = new Student<String>();
		st6 = new Student<Integer>();
		Employee emp1 = new Employee();
		emp1.empId = "JTC-001";
		emp1.empId = 4512;
		emp1.empName = "SomPrakash";

		Employee<Integer, String> emp2 = new Employee<Integer, String>();
		emp2.empId = 1234;
//		emp2.empId="";
		System.out.println();
		System.out.println();
		User<Integer, Long, Address<String, Integer>> ref1 = new User<Integer, Long, Address<String, Integer>>();

	}

}

class Student<T> {
	T studId;
}

class Employee<T1, T2> implements Compare<Employee<T1, T2>> {
	T1 empId;
	T2 empName;

//	static T1 val;
	public boolean compare(Employee<T1, T2> ref) {
		return false;
	}

}

interface Compare<T> {
	public boolean compare(T ref);
}

class User<T1, T2, T3> {
	T1 uid;
	T2 phone;
	T3 uad;
}

class Address<T1, T2> {
	T1 aid;
	T2 pin;
}