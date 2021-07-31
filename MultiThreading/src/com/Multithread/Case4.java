package com.Multithread;

import java.util.Date;

public class Case4 {

	public static void main(String[] args) {

		Hello4 h1 = new Hello4();
		Hello4 h2 = new Hello4();
		new Thread14(h1, "Thread1");
		new Thread24(h2, "Thread2");

	}

}

class Hello4 {
	void m1() {
		System.out.println("m1 in Hello");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + new Date());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void m2() {
		System.out.println("m2 in Hello");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "   " + new Date());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread14 implements Runnable {
	Hello4 h1 = null;
	String tname;

	public Thread14(Hello4 h1, String tname) {
		this.h1 = h1;
		Thread t1 = new Thread(this, tname);
		t1.start();
	}

	public void run() {
		h1.m1();
	}
}

class Thread24 implements Runnable {
	Hello4 h2 = null;
	String tname;

	public Thread24(Hello4 h2, String tname) {
		this.h2 = h2;
		Thread t1 = new Thread(this, tname);
		t1.start();
	}

	public void run() {
		h2.m2();
	}
}