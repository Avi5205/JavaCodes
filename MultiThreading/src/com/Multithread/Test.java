package com.Multithread;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello0 h1 = new Hello0();
		new AThread(h1,"AThread");
		new BThread(h1,"BThread");

	}

}
class Hello0{
	void m1() {
		System.out.println("m1 in Hello");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  	"+new Date());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	void m2(){
		System.out.println("m2 in Hello");
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  	"+new Date());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class AThread implements Runnable{
	Hello0 h1 = null;
	String tname;
	public AThread(Hello0 h1,String tname){
		this.h1 = h1;
		
		Thread t1 = new Thread(this,tname);
		t1.start();
	}
	public void run() {
		h1.m1();
	}
}

class BThread implements Runnable{
	Hello0 h1 = null;
	String tname;
	public BThread(Hello0 h1,String tname){
		this.h1 = h1;
		
		Thread t1 = new Thread(this,tname);
		t1.start();
	}
	public void run() {
		h1.m1();
	}
}
