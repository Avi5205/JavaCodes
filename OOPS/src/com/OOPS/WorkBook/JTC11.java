package com.OOPS.WorkBook;

public class JTC11 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		if (args.length == 1) {
			String cName = args[0];
			Class cl = Class.forName(cName);
			Class cl1 = Class.forName(cName);
			System.out.println(cl);
			System.out.println(cl1);
			System.out.println(cl == cl1);
			System.out.println("--Class Loaded\t:" + cl.getName());
		} else {
			System.out.println("MNO");
		}
	}
}
