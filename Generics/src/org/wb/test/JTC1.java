package org.wb.test;

import static com.jtc.p1.Hello.m1;
import static com.jtc.p1.Hello.m4;
import static com.jtc.p2.Abc.*;

@SuppressWarnings("unused")
public class JTC1 {

	public static void main(String[] args) {
		// Hello.m1();
		m1();
		m4();
//		m3();
		mm2();
//		m1Msg();
	}

	static void m4() {
		System.out.println("**m4 in Test class**");
	}

}
