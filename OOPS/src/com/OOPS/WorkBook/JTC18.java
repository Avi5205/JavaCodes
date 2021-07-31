package com.OOPS.WorkBook;

public class JTC18 {

	public static void main(String[] args) {
		System.out.println(Person1.minAgeToVote);
		Person1 per = null;
//		per = new Person1();
//		per.showWorkInfo();
//		System.out.println(per.name);

		per = new Employee2("SomPrakash", 7676763290L);
		per.showWorkInfo();
		System.out.println(per.name + "\t" + per.phone);

		per = new OldStudent();
		per.showWorkInfo();

		per = new CurrentStudent();
		per.showWorkInfo();
		System.out.println("\n**********************");
		Person1 p = null;
		p = PersonService.getInstance("Employee2");
		System.out.println(p.getPersonType());
		p = PersonService.getInstance("OldStudent");
		System.out.println(p.getPersonType());
		p = PersonService.getInstance("CurrentStudent");
		System.out.println(p.getPersonType());
	}

}

abstract class Person1 {
	static int minAgeToVote = 18;
	String name;
	long phone;

	Person1(String name, long phone) {
		this.name = name;
		this.phone = phone;
		System.out.println("--Person(String,long) Cons..\t:" + this);
	}

	Person1() {
		System.out.println("--Person() Cons..\t:" + this);
	}

	{
		System.out.println("\n**Person Instance Block**");
	}

	abstract void showWorkInfo();

	abstract String getPersonType();

	void show() {
//		Person p = new Person();
//		p.showWorkInfo();
	}

}

//class Farmer extends Person{}

class Employee2 extends Person1 {
	Employee2(String name, long phone) {
		super(name, phone);
	}

	Employee2() {
	}

	String getPersonType() {
		return "Employee";
	}

	void showWorkInfo() {
		System.out.println("--Employee working in Company--");
	}
}

abstract class Student1 extends Person1 {
}

class CurrentStudent extends Student1 {
	void showWorkInfo() {
		System.out.println("--Attending the Classes--");
	}

	String getPersonType() {
		return "CurrentStudent";
	}
}

class OldStudent extends Student1 {
	void showWorkInfo() {
		System.out.println("--Searching for Job--");
	}

	String getPersonType() {
		return "OldStudent";
	}
}

class PersonService {
	static Person1 getInstance(String cName) {
		if (cName.equals("Employee2"))
			return new Employee2();
		else if (cName.equals("OldStudent"))
			return new OldStudent();
		else if (cName.equals("CurrentStudent"))
			return new CurrentStudent();
		else
			return null;
	}
}
