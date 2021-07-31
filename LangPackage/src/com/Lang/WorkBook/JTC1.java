package com.Lang.WorkBook;

public class JTC1 {

	public static void main(String[] args) {
		System.out.println("***hashCode***");
		System.out.println("===Student===");
		Students st1 = new Students(99, "Som", 399111);
		Students st2 = new Students(99, "Som", 399111);
		Students st3 = new Students(88, "Prakash", 399111);
		Students st4 = st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);

		System.out.println("\n===Employee===");
		Employee emp1 = new Employee(99, "Som", 399111);
		Employee emp2 = new Employee(99, "Som", 399111);
		Employee emp3 = new Employee(88, "Prakash", 7458965);
		Employee emp4 = emp1;
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println(emp1 == emp2);
		System.out.println(emp1 == emp3);
		System.out.println(emp1 == emp4);

		System.out.println("\n***getClass***");
		ClassService.showClassInfo("JTC");
		ClassService.showClassInfo(st1);
		ClassService.showClassInfo(emp1);

		System.out.println("\n***toString***");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		String str1 = "OK ";
		str1 = str1 + str1;
		System.out.println(str1);
		System.out.println(emp1);
		System.out.println(emp3);

		Employee emp5 = null;
		System.out.println(emp5);
		String str11 = "OK ";
		str11 = str11 + emp5;
		System.out.println(str11);
//		System.out.println(emp5.toString()); // NullPointerException
		System.out.println("------------------");
		System.out.println(st1);
		System.out.println(st1.toString());
		String cName = st1.getClass().getName();
		System.out.println(cName);
		int hs = st1.hashCode();
		System.out.println(hs);
		String hx = Integer.toHexString(hs);
		System.out.println(hx);
		String msg = cName + "@" + hx;
		System.out.println(msg);

	}

}

class ClassService {
	@SuppressWarnings("rawtypes")
	static void showClassInfo(Object obj) {
		Class cl = obj.getClass();
		System.out.println("\nName\t:" + cl.getName());
		System.out.println("Name\t:" + cl.getSimpleName());
		System.out.println("Super Class\t:" + cl.getSuperclass());
		System.out.println("Package\t:" + cl.getPackage());

		Class intrs[] = cl.getInterfaces();
		for (int i = 0; i < intrs.length; i++) {
			Class in = intrs[i];
			System.out.println(in);
		}
	}
}

class Employee extends User {
	int eid;
	String name;
	long phone;

	public Employee(int eid, String name, long phone) {
		this.eid = eid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return "Info Eid:" + eid + ",Name:" + name + ",Phone:" + phone;
	}

	public int hashCode() {
		return (int) (phone << name.length());
	}
}

class User {
}

interface Inter1 {
}

interface Inter2 {
}

class Person {
}

class Students extends Person implements Inter1, Inter2 {
	int sid;
	String name;
	long phone;

	public Students(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
}