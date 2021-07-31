package com.Exception.WorkBook;

import java.io.IOException;

public class JTC8 {

	public static void main(String[] args) throws IOException, ArithmeticException {
		Hello h = new Hai();
		h.m1(1);

	}

}

class Hai extends Hello {
	public void m1(int x) {
		System.out.println("Hai-m1");
	}

	// OK
//	public void m1(int x) throws IOException,ArithmeticException{
//		System.out.println("Hai-m1");
//	}

	// OK
//	public void m1(int x)throws AException,ArithmeticException{
//		System.out.println("Hai-m1");
//	}

	// NOT OK
//	public void m1(int x)throws Exception,ArithmeticException{
//		System.out.println("Hai-m1");
//	}
}

@SuppressWarnings("serial")
class AException extends IOException {
}

class Hello {
	void m1(int x) throws IOException, ArithmeticException {
		if (x == 1) {
			throw new ArithmeticException();
		} else {
			throw new IOException();
		}
	}
}