package com.Collection.Workbook;

import java.util.*;

public class JTC8 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("****Array List****");
		ArrayList al = new ArrayList();
		al.add("bb");
		al.add("cc");
		al.add("aa");
		al.add("dd");
		// al.add(new Integer(99));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.rotate(al, 1);
		System.out.println(al);
		Collections.swap(al, 1, 3);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, "cc"));
		Collections.fill(al, "jtc");
		System.out.println(al);

		System.out.println("\n****Vector****");
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.addElement("abc");
		System.out.println(v);

		System.out.println("\n****Enumeration****");
		Enumeration e = v.elements();
		List al1 = Collections.list(e);
		System.out.println(e);
		System.out.println(v);
		System.out.println(al1);
		al1 = Collections.unmodifiableList(al1);
//		al1.add("11");
	}
}
