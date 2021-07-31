package com.WorkBook;

public class JTC5 {

	public static void main(String[] args) {
		System.out.println("-- Main Started --");
		System.out.println("No of Arg\t:" + args.length);
		try {

			int ab = Integer.parseInt(args[0]);
			System.out.println("-- ab value is\t:" + ab);
			int res = 123 / ab;
			System.out.println("-- Result is\t:" + res);
		} catch (ArithmeticException e) {
			System.out.println("\n*Value should not be 0*");
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("\n* Provide one int Value as CLA *");
		} catch (Exception e) {
			System.out.println("\n* Other Exception Occured *");
		}
		System.out.println("\nAfter Catch Block");
		System.out.println("Main Completed");
	}
}
