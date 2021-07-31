package com.Exception.Book;

public class JTC105 {

	public static void main(String[] args) {
		int i1 = 10;
		try {
			int i2 = Integer.parseInt(args[0]);
			int ii = i1/i2;
			System.out.println(ii);
		} catch (NumberFormatException e) {
			System.out.println("Please provide numeric value.."+e);
		}catch(ArithmeticException e) {
			System.out.println("Please provide non zero value.."+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide some value.."+e);
		}catch(Exception e) {
			System.out.println("Boss of all exceptions.."+e);
		}
	}

}
