package com.Collection.Workbook;

import java.util.*;

public class JTC4 {
	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })

	public static void main(String[] args) {
		System.out.println("****Hash Set*****\n");
		HashSet hs = new HashSet();
		hs.add(new Integer(99));
		System.out.println(hs.add("som"));
		hs.add("som@jtc");
		System.out.println(hs.add("som"));
		System.out.println(hs);

		System.out.println("\n****Tree Set****");
		TreeSet ts = new TreeSet();
		// ts.add(new Integer(99));
		System.out.println(ts.add("som"));
		ts.add("som@jtc");
		System.out.println(ts.add("som"));
		ts.add("aaaa");
		ts.add("cccc");
		ts.add("bbbb");
		System.out.println(ts);

		System.out.println("\n****Linked Hash Set****");
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("som"));
		lhs.add("som@jtc");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);

	}
}
