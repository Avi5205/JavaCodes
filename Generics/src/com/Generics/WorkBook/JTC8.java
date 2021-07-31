package com.Generics.WorkBook;

public class JTC8 {

	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer in1 = new Integer(123);
		Integer in2 = new Integer(123);
		System.out.println(in1 == in2);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(true);

		System.out.println(b1 == b2);
		System.out.println("\n------------");

		Boolean b3 = false;
		Boolean b4 = false;
		Boolean b5 = false;
		System.out.println(b3 == b4);
		System.out.println(b4 == b5);

		System.out.println("\n---BYTE---");
		Byte by1 = 127;
		Byte by2 = 127;
		System.out.println(by1 == by2);
		System.out.println("\n--CHARACTER--");
		Character ch1 = 'A';
		Character ch2 = 'A';
		System.out.println(ch1 == ch2);
		Character ch3 = 128;
		Character ch4 = 128;
		System.out.println(ch3 == ch4);
		System.out.println("\n--INTEGER--");
		Integer in3 = 127;
		Integer in4 = 127;
		System.out.println(in3 == in4);
		Integer in5 = 128;
		Integer in6 = 128;
		System.out.println(in5 == in6);
		System.out.println("\n--LONG--");
		Long ref1 = 127L;
		Long ref2 = 127L;
		System.out.println(ref1 == ref2);
		System.out.println("\n--FLOAT--");
		Float f1 = 12.0F;
		Float f2 = 12.0F;
		System.out.println(f1 == f2);
		System.out.println("===============");
		Integer in11 = 123;
		Integer in12 = 122;
		Integer in13 = 122;
		in12++;
		in13 = in13 + 1;
		System.out.println(in11 + "\t" + in12 + "\t" + in13);
		System.out.println(in11 == in12);
		System.out.println(in11 == in13);
	}

}
