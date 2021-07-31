package com.Collection.Book;

import java.util.*;

public class Hello01 {

	@SuppressWarnings({ "unchecked", "removal", "rawtypes" })
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		System.out.println(li.size());
		System.out.println(li);
		li.add("first");
		li.add(123);
		li.add(new Integer(123));
		li.add(new Hello());
		li.add(new Hello());
		li.add(27.333);
		li.add("last");
		System.out.println("****HashCode****");
		System.out.println(li.hashCode());
		System.out.println("\n");
		li.addFirst("Before First");
		li.addLast("After Last");
		System.out.println(li);
		System.out.println(li.hashCode());
		System.out.println("*********************\n");
		List lst = new LinkedList();
		lst.add("abc");
		lst.add(123);
		System.out.println(lst.add("abc"));
		System.out.println(lst);
//		lst.addFirst("Before First");
//		lst.addLast("After Last");
		boolean b1 = li.contains(123);
		System.out.println(b1);
		System.out.println(li);

		LinkedList ll1 = new LinkedList();
		ll1.add(123);
		ll1.add("first");
		ll1.add("last");
		System.out.println(ll1);
		System.out.println(li.contains(ll1));
		System.out.println(ll1.contains(li));
		li.addAll(ll1);
		System.out.println(li);
		System.out.println("***using iterator***");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n***List Iterator Forward***");
		ListIterator l = li.listIterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("\n*****Previous*****");
		while (l.hasPrevious()) {
			System.out.println(l.previous());
			Object o = l.previous();
			System.out.println(o);
		}
	}

}
