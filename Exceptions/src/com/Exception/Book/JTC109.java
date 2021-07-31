package com.Exception.Book;

public class JTC109 {

	public static void main(String[] args) {
		UseRes ur = new UseRes();
		ur.m1();
	}
}
class Window{
	public Window() {
		System.out.println("Open Window");
	}
	public void close() {
		System.out.println("close Window");
	}
}
class Door{
	Door(){
		System.out.println("Open Door");
	}
	public void close() {
		System.out.println("Close Door");
	}
}
class UseRes{
	int m1() {
		Door dr = null;
		Window wn = null;
		
		try {
			dr = new Door();
			wn = new Window();
			System.out.println("Perform your task");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dr.close();
			wn.close();
		}
		return 20;
	}
}
