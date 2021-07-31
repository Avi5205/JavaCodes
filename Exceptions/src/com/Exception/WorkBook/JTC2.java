package com.Exception.WorkBook;

public class JTC2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			int x = Integer.parseInt(args[0]);
			System.out.println(x);
			int y = 10 / x;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Provide the value");
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("Please Provide integer number");
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("Please Don't Provide Zero");
		} catch (Exception e) {
			System.out.println("Please Don't do this");
			System.out.println(e);
		}
		System.out.println("main end");

	}

}
