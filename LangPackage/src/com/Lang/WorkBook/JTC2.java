package com.Lang.WorkBook;

public class JTC2 {

	public static void main(String[] args) {
		String st1 = "JTC";
		String st2 = "JTC";
		String st3 = new String("JTC");
		System.out.println(st1+"\t"+st2+"\t"+st3);
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println("--------------");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println("--Student--");
		Student stu1 = new Student(99, "SOmPrakash");
		Student stu2 = new Student(99, "SOmPrakash");
		System.out.println("==\t:"+(stu1 == stu2));
		System.out.println("eq()\t:"+stu1.equals(stu2));
		System.out.println("--Employee--");
		Employee1 emp1 = new Employee1(99,"SomPrakash");
		Employee1 emp2 = new Employee1(99,"SomPrakash");
		Employee1 emp3 = new Employee1(99,"SomPrakash");
		System.out.println("==\t:"+(emp1 == emp2));
		System.out.println("eq()\t:"+emp1.equals(emp2));
		System.out.println("eq()\t:"+emp1.equals(emp3));
	}

}

class Student{
	int sid;
	String name;
	public Student(int sid,String name) {
		this.sid = sid;
		this.name = name;
	}
}
class Employee1{
	int eid;
	String name;
	public Employee1(int eid,String name) {
		this.eid = eid;
		this.name = name;
	}
	public boolean equals(Object obj) {
		Employee1 emp = (Employee1)obj;
		return this.eid == emp.eid && this.name.equals(emp.name);
	}
}
