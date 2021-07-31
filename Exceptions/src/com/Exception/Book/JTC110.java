package com.Exception.Book;

class Window1 implements AutoCloseable{
	public Window1() {
		System.out.println("Open Window");
	}
	public void close() {
		System.out.println("Close Window");
	}
}

class Door1 implements AutoCloseable{
	Door1(){
		System.out.println("Open Door");
	}
	public void close() {
		System.out.println("Close Door");
	}
}

public class JTC110 {

	public static void main(String[] args) {
		try(Door1 dr = new Door1();Window1 wn = new Window1()){
			System.out.println("Use Resource");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
