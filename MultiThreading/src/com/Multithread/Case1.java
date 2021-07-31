package com.Multithread;

import java.util.Date;

public class Case1 {

	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		new Thread1(h1,"Thread1");
		new Thread2(h1,"Thread2");

	}

}
class Hello1{
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

class Thread1 implements Runnable{
	
	Hello1 h1 = null;
	String tname;
	
	public Thread1(Hello1 h1, String tname) {
		this.h1 = h1;
		Thread t1 = new Thread(this,tname);
		t1.start();
	}
	public void run() {
		h1.m1();
	}
}

class Thread2 implements Runnable{
	Hello1 h1 = null;
	
	String tname;
	
	public Thread2(Hello1 h1,String tname) {
		this.h1 = h1;
		Thread t2 = new Thread(this,tname);
		t2.start();
	}
	
	public void run() {
		h1.m1();
	}
}
