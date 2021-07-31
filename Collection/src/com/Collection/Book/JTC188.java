package com.Collection.Book;

import java.util.*;

public class JTC188 {

	@SuppressWarnings({ "unchecked", "rawtypes", "removal" })
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("abc");
		al1.add(new Integer(199));
		al1.add(new Double(111.11));
		System.out.println(al1);
		System.out.println("*************************\n");
		ArrayList al2 = new ArrayList();
		al2.add(9999);
		al2.add("Som");
		System.out.println(al2);
		al1.add(al2);
		System.out.println("*************************\n");
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("*************************\n");
		Iterator it1 = al1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("*************************\n");
		System.out.println(al2);
		ArrayList al3 = new ArrayList();
		al3.add("som");
		al3.add("abc");
		al3.add(91819);
		System.out.println(al3);
		System.out.println("\nReturn Method");
		System.out.println(al2);
		System.out.println(al3);
//		al2.returnAll(al3);
//		al3.returnAll(al3);
		al2.clear();
		al3.clear();
		System.out.println(al2);
		System.out.println(al3);
	}

}
