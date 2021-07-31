package org.wb.test;

import static com.jtc.p1.Hello.m1;
import static com.jtc.p1.Hello.m4;
import com.jtc.p1.Hello;

@SuppressWarnings("unused")
public class JTC2 {

	public static void main(String[] args) {
		m1();
		m4();
		Hello.m4();
	}

	static void m4() {
		System.out.println("**m4 in Test class**");
	}

}
