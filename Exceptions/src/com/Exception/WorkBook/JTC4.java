package com.Exception.WorkBook;

public class JTC4 {

	public static void main(String[] args) {
		System.out.println("IN MAIN");
		int ab = ArithmeticOperation.getReminder("12", "7");
		System.out.println("In Main rem\t:" + ab);
		int xy = ArithmeticOperation.getReminder("12", "0");
		System.out.println("In Main rem\t:" + xy);
		try {
			int rt = ArithmeticOperation.getReminder("12", "J");
			System.out.println("In Main rem\t:" + rt);
		} catch (NumberFormatException e) {
			System.out.println("==catch in Main Method==");
		}
		System.out.println("\n--Main Completed--");
	}

}

class ArithmeticOperation {
	public static int getReminder(String val1, String val2) {
		int rem = -1;
		try {
			System.out.println("\n**getRemainder**");
			System.out.println("Value\t:" + val1 + "\t" + val2);
			System.out.println("--Converting into int type--");
			int ab = Integer.parseInt(val1);
			int bc = Integer.parseInt(val2);
			System.out.println("--Accessing remainder--");
			rem = ab % bc;
			System.out.println("Remainder\t:" + rem);
			return rem;
		} catch (ArithmeticException e) {
			System.out.println("--catch in getRemainder--");
		} finally {
			System.out.println("++ Finally Block in getRemainder++");
		}
		return rem;
	}
}