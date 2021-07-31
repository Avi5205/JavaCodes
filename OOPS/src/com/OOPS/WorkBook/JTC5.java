package com.OOPS.WorkBook;

public class JTC5 {

	public static void main(String[] args) {
		new Employee(99).show();
		System.out.println();
		new Employee("Chandan").show();
		System.out.println();
		new Employee(98,"SomPrakash").show();
		System.out.println();
		new Employee(45,"Vikash",6526668).show();
		System.out.println();
		new Employee(58,"Manish",7676763290L,85000.0F).show();
		System.out.println();
		new Employee(6526668,"Rai",78562.00F).show();
	}

}
class Employee{
	int eid;
	String name;
	long phone;
	float salary;
	
	Employee(int eid){
		System.out.println("--Employee(int)--\t:"+this);
		this.eid = eid;
	}
	Employee(String name){
		super();
		System.out.println("--Employee(String)--\t:"+this);
		this.name = name;
	}
	Employee(int eid,String name){
		this(eid);
//		super();
		System.out.println("--Employee(int,String)--\t:"+this);
//		Employee(eid);
//		this(eid);
		this.name = name;
	}
	Employee(int eid,String name,long phone){
		this(eid,name);
		System.out.println("--Employee(int,String,long)--\t:"+this);
		this.phone = phone;
	}
	Employee(int eid,String name,long phone,float salary){
		this(eid,name,phone);
		System.out.println("--Employee(int,String,long,float)--\t:"+this);
		this.salary = salary;
	}
	
	Employee(long phone,String name,float salary){
		this(name);
		System.out.println("--Employee(long,String,float)--\t:"+this);
		this.phone = phone;
		this.salary = salary;
	}
	
	void show() {
		System.out.println(eid+"\t"+name+"\t"+phone+"\t"+salary);
	}
}




















