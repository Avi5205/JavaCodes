package com.Multithread;

import java.util.Date;


public class Case3 {

	public static void main(String[] args) {
		Hello3 h1 = new Hello3();
		new Thread12(h1,"Thread1");
		new Thread23(h1,"Thread2");
	}

}
class Hello3{
	void m1() {
		System.out.println("m1 in Hello");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"   "+new Date());
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
			System.out.println(Thread.currentThread().getName()+"  "+new Date());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread12 implements Runnable{
	Hello3 h1 = null;
	String tname;
	
	public Thread12(Hello3 h1,String tname) {
		this.h1=h1;
		Thread t1 = new Thread(this,tname);
		t1.start();
	}
	
	public void run() {
		h1.m1();
	}
}

class Thread23 implements Runnable{
	Hello3 h1=null;
	String tname;
	
	public Thread23(Hello3 h1,String tname) {
		this.h1 = h1;
		Thread t2 = new Thread(this,tname);
		t2.start();
	}
	
	public void run() {
		h1.m2();
	}
}