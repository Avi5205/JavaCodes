package com.Lang.WorkBook.GC;

import java.sql.Connection;

public class JTC4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("--IN Main--");
		new Student(99);
		Student st = new Student(88);
		st.finalize();
		System.out.println("Value of sid\t:"+st.sid);
		st = null;
		Student st1 = new Student(77);
		st1 = new Student(66);
		Student st2 = new Student(55);
		Student st3 = new Student(44);
		st2 = st3;
		System.gc();
		show();
		for(int i = 0; i < 5; i++) {
			System.out.println("I value\t:"+i);
		}
		Student st99 = new Student(33);
		System.gc();
		System.out.println("--Main Completed--");
	}
		@SuppressWarnings("unused")
		static void show() {
			Student stud1 = new Student(101);
			Student stud2 = new Student(202);
			
		}

	}



final class Student {
	int sid;
	@SuppressWarnings("unused")
	private Connection con = null;

	Student(int sid) {
		this.sid = sid;

		System.out.println("--Connected with Resource--\t:" + sid);
	}

	void addInfo() {

	}

	void deleteInfo() {

	}

	public void finalize() {
		System.out.println("**Resource is RELEASED**\t:" + sid);
	}
}