package com.OOPS.WorkBook;

public class JTC16 {

	public static void main(String[] args) {
		A$B ref = null;
		ref = new A$B();
		System.out.println(ref);
//		X$Y ref2 = null;
		X.Y ref3 = null;
		X ref4 = new X();
//		ref3 = new Y();
		ref3 = ref4.new Y();
		ref3 = new X().new Y();
		System.out.println(ref3);
		System.out.println("\n\n----------");
		Hello.display();
		System.out.println();
		Hello he = new Hello("MSG in MAIN");
		System.out.println(he.msg);
//		System.out.println(he.intValue);
		he.show();
		Hello.JTCInner1 inRef = null;
		inRef = new Hello("MSG IN MAIN AGAIN").new JTCInner1(6060);
		inRef.showDataInInnerClass();
		System.out.println(inRef.intValue);
//		System.out.println(inRef.msg);
				

	}

}

class A$B {
}

class B {
}

class A {
//	class B{}
}

class X {
	int var = 10;

	class Y {
	}
}

class Y {
}

//class X$Y{}

class Hello {
	static int VAL = 9090;
	String msg;

	Hello(String msg) {
		this.msg = msg;
	}

	class JTCInner1 {
//		static int stValue = 9876;
		final static int CONS = 9999;
		int intValue;

		public JTCInner1(int intValue) {
			this.intValue = intValue;
		}

		void showDataInInnerClass() {
			System.out.println("\n**showData in Inner Class**");
			System.out.println(intValue);
			System.out.println(CONS);
			System.out.println(msg);
//			System.out.println(this.msg);
			System.out.println(VAL);
		}
	}

	void show() {
		System.out.println("\nINSTANCE show Method");
		System.out.println(VAL);
		System.out.println(msg);
		System.out.println(this.msg);
		JTCInner1 ref = null;
		ref = new JTCInner1(1111);
		ref = this.new JTCInner1(1111);
		System.out.println(ref.intValue);
		ref.showDataInInnerClass();
	}

	@SuppressWarnings("null")
	static void display() {
		System.out.println("\n--Static Display Method--");
		System.out.println(VAL);
//		System.out.println(msg);
		Hello ref = new Hello("MSG in Display");
		System.out.println(ref.msg);
		try {
			JTCInner1 ref1 = null;
//			ref1 = ref.new JTCInner1(2222);
			ref1.showDataInInnerClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}