package com.Collection.Workbook;

import java.util.*;

public class JTC3 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.add("som@jtc");
		v.add("som");
		System.out.println(v);

		System.out.println("\n****Enumeration****");
		Enumeration e = v.elements();
		System.out.println("forward order");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("\n****Iterator*****");
		Iterator it = v.iterator();
		System.out.println("forward order");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n****LinkedList****");
		LinkedList ll = new LinkedList(v);
		ll.addFirst("11");
		ll.addLast("22");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

	}
}
