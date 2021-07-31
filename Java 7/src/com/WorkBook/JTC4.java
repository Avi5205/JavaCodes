package com.WorkBook;

import java.util.*;

public class JTC4 {

	public static void main(String[] args) {

		// Before Java 7
		List<String> list = new ArrayList<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		Student<Integer, String, Long, String> st = new Student<Integer, String, Long, String>();

		// From Java 7
		List<String> list2 = new ArrayList<>();
		Map<Integer, String> map2 = new HashMap<>();
		Student<Integer, String, Long, String> st2 = new Student<>();
	}
}

class Student<I, N, P, A> {
	I id;
	N name;
	P phone;
	A add;
}