package com.Exception.Book;

public class JTC104 {

	public static void main(String[] args) {
		System.out.println("In JTC104");
		try {
			int i = Integer.parseInt(args[0]);
			int i1 = 10/i;
			System.out.println(i);
			System.out.println(i1);
		} catch (Exception e) {
			System.out.println("in catch...");
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Plz provide the value"+e);
			}
			else if(e instanceof NumberFormatException) {
				System.out.println("Plz provide numeric value.."+e);
			}
		}
	}

}
