package com.Lang.WorkBook;

public class JTC5 {

	public static void main(String[] args) {
		Address1 add = new Address1(101, "c-29 Sector-2 noida", "Noida", 201301);
		Student2 stud = new Student2(99, "Som Prakash", 6526668, add);
		System.out.println(stud);
		System.out.println("__Modifying the add ref in Main__");
//		stud.studAdd.aid = 1234;
		add.aid = 14523;
		add.street = "Sector 2 noida";
		System.out.println(stud);
		System.out.println(stud.getSid());
		Address1 ref = stud.getStudAddress();
		ref.aid = 1111;
		System.out.println(stud);
	}

}

class Address1 {
	int aid;
	String street;
	String city;
	int pin;

	public Address1(int aid, String street, String city, int pin) {
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public Object clone() {
		return new Address1(this.aid, this.street, this.city, this.pin);
	}

	public String toString() {
		return aid + "\t" + "street" + "\t" + city + "\t" + pin;
	}
}

final class Student2 {
	private final int sid;
	private final String name;
	private final long phone;
	private final Address1 studAdd;

	public Student2(int sid, String name, long phone, Address1 studAdd) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.studAdd = new Address1(studAdd.aid, studAdd.street, studAdd.city, studAdd.pin);
	}

	public String toString() {
		return "Stud Info\t:" + sid + "\t" + name + "\t" + phone + "\nAdd Info\t:" + studAdd;
	}

	public int getSid() {
		return this.sid;
	}

	public Address1 getStudAddress() {
		return (Address1) studAdd.clone();
	}
}
