package com.Generics.WorkBook;

public class JTC7 {

	@SuppressWarnings({ "unused", "removal" })
	public static void main(String[] args) {
		Integer in = 123;
		in++;
		System.out.println(in + 10);
		int ab = in;
//		int ab = in.intValue();
//		System.out.println(ab);
		long val = 123;
//		Long ref = new Integer(123);
//		Long obj = 1234;
		Long obj2 = 1234L;
		Object obj4 = 1234;
		Number num = 1234;
		System.out.println("-----------");
		Integer in1 = 123;
		Integer in2 = in1;
		System.out.println(in1 + "\t" + in2);
		System.out.println(in1 == in2);
		in1++;
		int t = in1.intValue();
		t++;
		in1 = new Integer(t);
		System.out.println(in1 + "\t" + in2);
		System.out.println(in1 == in2);
	}

}
