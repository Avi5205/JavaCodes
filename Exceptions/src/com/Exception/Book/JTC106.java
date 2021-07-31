package com.Exception.Book;

public class JTC106 {

	public static void main(String[] args) {
		int i1 = 10;
		try {
			int i2 = Integer.parseInt(args[0]);
			int ii = i1/i2;
			System.out.println(ii);
		}catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
