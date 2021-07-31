package com.Multithread;

import java.util.Date;

public class Case5 {

	public static void main(String[] args) {
		Hello5 h1 = new Hello5();
		new Thread15(h1,"Thread1");
		new Thread25(h1,"Thread2");

	}

}

class Hello5 {
	 public synchronized void m1() {
		System.out.println("m1 in Hello");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "   " + new Date());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void m2() {
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

class Thread15 implements Runnable {
	Hello5 h1 = null;
	String name;

	Thread15(Hello5 h1, String name) {
		this.h1 = h1;
		Thread t1 = new Thread(this, name);
		t1.start();
	}

	public void run() {
		h1.m1();
	}
}

class Thread25 implements Runnable {

	Hello5 h1 = null;
	String name;

	Thread25(Hello5 h1, String name) {
		this.h1 = h1;
		Thread t2 = new Thread(this, name);
		t2.start();

	}

	public void run() {
		h1.m1();
	}
}