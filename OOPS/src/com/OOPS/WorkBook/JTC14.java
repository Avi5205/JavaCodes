package com.OOPS.WorkBook;

public class JTC14 {

	public static void main(String[] args) throws Exception {
		System.out.println("In Main Method Loading the Hello Class");
		ClassLoader loader = JTC2.class.getClassLoader();
		Class.forName("Hello",false,loader);
		System.out.println("--Class Loaded Successfully--");
		System.out.println("Delete the .class file and press Enter");
		System.in.read();
		Hello2 h = new Hello2();
		h.show();
		h.display();
		new Hello2(12).show();
		new Hello2(89, "JTC").show();
		new Hello2().display();
		System.out.println(Hello2.value);
	}

}
class Hello2{
	int ab;
	String msg;
	static int value = 1234;
	Hello2(){
		System.out.println("--Hello() Cons--");
	}
	Hello2(int ab){
		System.out.println("--Hello(int) Cons--");
	}
	Hello2(int ab, String msg){
		System.out.println("--Hello(int,String) Cons--");
	}
	void show() {
		System.out.println("**show() in Hello**");
		System.out.println(ab);
		System.out.println(msg);
	}
	void display() {
		System.out.println("**display() in Hello**");
	}
}