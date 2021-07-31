package com.Multithread.WorkBook;

public class JTC5 {

	public static void main(String[] args) {
		HelloJTC1 h = new HelloJTC1();
		new AA(h, "A");
		new BB(h, "B");

	}

}

class AA implements Runnable {

	HelloJTC1 h = null;

	AA(HelloJTC1 h, String name) {
		this.h = h;
		Thread t = new Thread(this, name);
		t.start();
		System.out.println(t.getThreadGroup().getName());
	}

	public void run() {
		h.m1();
	}
}

class BB implements Runnable {

	HelloJTC1 h = null;

	BB(HelloJTC1 h, String name) {
		this.h = h;
		Thread t2 = new Thread(this, name);
		t2.start();
		System.out.println(t2.getThreadGroup().getName());
	}

	public void run() {
		h.m2();
	}
}

class HelloJTC1 {
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