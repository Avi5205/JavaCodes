package com.Multithread;

import java.util.Date;

public class Case2 {

	public static void main(String[] args) {
		Hello2 h1 = new Hello2();
		Hello2 h2 = new Hello2();
		new Thread11(h1,"Thread1");
		new Thread22(h2,"Thread2");

	}

}
class Hello2{
	void m1() {
		System.out.println("m1 in Hello");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+new Date());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	void m2() {
		System.out.println("m2 in Hello");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"   "+new Date());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread11 implements Runnable{
	
	Hello2 h1 = null;
	String tname;
	
	public Thread11(Hello2 h1, String tname) {
		this.h1 = h1;
		Thread t1 = new Thread(this,tname);
		t1.start();
	}
	public void run() {
		h1.m1();
	}
}

class Thread22 implements Runnable{
	Hello2 h2 = null;
	
	String tname;
	
	public Thread22(Hello2 h2,String tname) {
		this.h2 = h2;
		Thread t2 = new Thread(this,tname);
		t2.start();
	}
	
	public void run() {
		h2.m1();
	}
}
