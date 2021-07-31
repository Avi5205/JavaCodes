package com.Collection.Book;

import java.util.*;

public class JTC187 {

	@SuppressWarnings({ "rawtypes", "unchecked", "removal", "unused" })
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		System.out.println(al1);
		System.out.println(al1.size());
		al1.add(1234);
		al1.add(new Integer(111));
		al1.add("abc");
		al1.add(new Hello());
		al1.add(new Hai());
		al1.add("abc");
		al1.add(null);
		System.out.println(al1);
		System.out.println("Each ...... loop\n");
		for (Object o : al1) {
			if (o instanceof Integer) {
				System.out.println(o.toString());
			} else if (o instanceof Hello) {
				System.out.println(o);
				Hello h1 = (Hello) o;
				h1.m1();
			} else {
				System.out.println(o);
			}
		}
		System.out.println("****Iterator****");
		Iterator it = al1.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if (o instanceof Hello) {
				Hello h11 = (Hello) o;
			}
		}
		System.out.println("****accessing again****");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("****Using List Iterator****");
		ListIterator li = al1.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("****previous*****");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}

class Hello {

	void m1() {
		System.out.println("m1 in Hello");
		System.out.println(this.getClass().getName());
	}

	public String toString() {
		return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}

class Hai {
	public String toString() {
		return "xyz";
	}
}
