package com.Multithread.WorkBook;

public class JTC4 {

	public static void main(String[] args) {
		HelloJTC h = new HelloJTC();
		new A(h, "A");
		new B(h, "B");
	}

}

class A implements Runnable {
	HelloJTC h = null;

	A(HelloJTC h, String name) {
		this.h = h;
		Thread t1 = new Thread(this, name);
		t1.start();
		System.out.println(t1.getThreadGroup().getName());
	}

	public void run() {
		h.m1();
	}
}

class B implements Runnable {

	HelloJTC h = null;

	B(HelloJTC h, String name) {
		this.h = h;
		Thread t2 = new Thread(this, name);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}

	public void run() {
		h.m2();
	}
}

class HelloJTC {
	synchronized void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("m1 - " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	synchronized void m2() {
		for (int i = 10; i <= 15; i++) {
			System.out.println("m2 - " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
