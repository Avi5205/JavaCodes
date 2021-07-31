package com.OOPS.WorkBook;

public class JTC15 {

	public static void main(String[] args) {
		System.out.println(MyOuterClass.MyInnerClass.LENGTH);
		System.out.println(MyOuterClass.MyInnerClass.val);
		MyOuterClass.MyInnerClass.displayMessage();
//		MyInnerClass ref1 = null;
//		MyOuterClass.MyInnerClass ref = null;
		MyOuterClass.MyInnerClass ref = new MyOuterClass.MyInnerClass("Hello");
		System.out.println(ref.msg);
		ref = new MyOuterClass.MyInnerClass("Message from Main Method");
	}

}

class MyOuterClass {
	int result = 1045;
	static int value = 1212;

	static class MyInnerClass {
		static int val = 9090;
		static final int LENGTH = 10;
		String msg;

		MyInnerClass(String msg) {
			this.msg = msg;
		}

		static void displayMessage() {
			System.out.println("--display Message static in Inner Class--");
		}

		void showResult() {
			System.out.println("\n--showResult() in Inner Class--");
			System.out.println("MSG\t:" + msg);
			System.out.println("Val\t:" + val);
			System.out.println("**Member of Outer Class**");
			System.out.println("Static\t:" + value);
//			System.out.println("ins\t:"+result);
			System.out.println("ins\t:" + new MyOuterClass().result);
		}
	}

	void showInOuterClass() {
		System.out.println("\n--ShowInOuterClass--");
		MyInnerClass ref1 = new MyInnerClass("ShowInnerClass Reference");
		System.out.println(ref1.msg);
	}

	static void displayInOuterClass() {
		System.out.println("\n--displayInOuterClass--");
		MyInnerClass ref1 = new MyInnerClass("displayInnerClass Reference");
		System.out.println(ref1.msg);
	}
}