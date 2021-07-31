package com.Lang.WorkBook;

public class JTC3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 emp1 = new Employee2(88, "Manish");
		emp1.showClone();
		System.out.println("--------------------");
		LoginInfo log = new LoginInfo(101, "somsree", "JTCindia");
		Address ad = new Address("c-29", "Noida", 201301);
		Student1 st = new Student1(999, "Som Prakash", 6526668, ad, log);
		System.out.println(st);
		Student1 stud = (Student1) st.clone();
		System.out.println("\n**After Cloning the Object**");
		System.out.println(st == stud);
		System.out.println(st.studAdd == stud.studAdd);
		System.out.println(st);
		System.out.println(stud);
		System.out.println("\n===MODIFYING THE DATA===");
		stud.sid = 90909;
		stud.name = "Manish";
		stud.phone = 745896;
		stud.studAdd.street = "DELHI";
		stud.login.uname = "JTCuser";
		System.out.println(st);
		System.out.println(stud);

	}

}

class Student1 implements Cloneable {
	int sid;
	String name;
	long phone;
	Address studAdd;
	LoginInfo login;

	public Student1(int sid, String name, long phone, Address studAdd, LoginInfo login) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.studAdd = studAdd;
		this.login = login;
	}

	public String toString() {
		return "\nStud Info\t:" + sid + "\t" + name + "\t" + phone + "\nAdd Info" + studAdd + "\nLogin Info\t:" + login;
	}

	public Object clone() throws CloneNotSupportedException {
		Object obj = null;
		if (this instanceof Cloneable) {
			Address ad = new Address(this.studAdd.aid, this.studAdd.street, this.studAdd.pin);
			LoginInfo info = new LoginInfo(this.login.loginId, this.login.uname, this.login.pwd);
			obj = new Student1(this.sid, this.name, this.phone, ad, info);
		} else {
			throw new CloneNotSupportedException(this.getClass().getName());
		}
		return obj;
	}

}

class Employee2 implements Cloneable {
	int eid;
	String name;

	public Employee2(int eid, String name) {
		this.eid = eid;
		this.name = name;
		System.out.println("--Employee(int,String)--");
	}

	public String toString() {
		return eid + "\t" + name;
	}

	void showClone() throws CloneNotSupportedException {
		Employee2 ep = (Employee2) clone();
		System.out.println("this\t\t" + this);
		System.out.println("Cloned Object\t:" + ep);
		System.out.println(this == ep);
	}
}

class Address {
	String aid;
	String street;
	int pin;

	public Address(String aid, String street, int pin) {
		this.aid = aid;
		this.street = street;
		this.pin = pin;
	}

	public String toString() {
		return aid + "\t" + street + "\t" + pin;
	}
}

class LoginInfo {
	int loginId;
	String uname;
	String pwd;

	public LoginInfo(int loginId, String uname, String pwd) {
		this.loginId = loginId;
		this.uname = uname;
		this.pwd = pwd;
	}

	public String toString() {
		return loginId + "\t" + uname + "\t" + pwd;
	}
}