package com.OOPS.WorkBook;

public class JTC3 {

	public static void main(String[] args) {
		byte by1 = 123;
		OverloadManager mngr = new OverloadManager();
		mngr.show(12, by1);
		mngr.show(by1,123);
//		mngr.show(by1, by1);
		mngr.show((int)by1, by1);
		mngr.show(by1, (int)by1);
		String str = null;
		Object obj = null;
		int arr[] = null;
		
		mngr.display(str);
		mngr.display(obj);
		mngr.display(str);
		mngr.display(null);
		mngr.showValues(arr);
		mngr.showValues(str);
//		mngr.showValues(null);
		mngr.showValues((String)null);
		mngr.showValues((int[])null);

	}

}
class OverloadManager{
	void show(int ab, byte b1) {
		System.out.println("**Show(int,byte)**");
	}
	void show(byte b1,int ab) {
		System.out.println("**show(byte,int)**");
	}
	void display(String str) {
		System.out.println("__display(String)__");
	}
	void display(Object obj) {
		System.out.println("__display(Object)__");
	}
	void showValues(String str) {
		System.out.println("--showValues(String)--");
	}
	void showValues(int[] arr) {
		System.out.println("--showValues(int[])--");
	}
}