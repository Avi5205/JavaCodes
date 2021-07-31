package com.Generics.WorkBook;

import java.util.*;

public class JTC12 {

	@SuppressWarnings({ "unchecked", "rawtypes", "removal" })
	public static void main(String[] args) {
		System.out.println("--Without Generics--");
		List list = new ArrayList();
		list.add("somprakash");
		list.add("Manish");
		list.add("Hello");
		list.add("Welcome");
		list.add(new Integer(12));

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof Integer) {
				Integer in = (Integer) obj;
				System.out.println(in);
			} else if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str);
			}
		}
		System.out.println("\n--Using Generics with List--");
		List<String> list1 = new ArrayList<String>();
		list1.add("SomPrakash");
		list1.add("Manish");
		list1.add("Hello");
		list1.add("Welcome");
//		list1.add(new Integer(12));

		Iterator<String> it1 = list1.iterator();
		while (it1.hasNext()) {
			String str = it1.next();
			System.out.println(str);
		}
		System.out.println("\n\nFrom Map Object");
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1234, "Som");
		map.put(8767, "Prakash");
		map.put(5677, "Manish");
		map.put(2343, "Rai");
		map.put(9898, "Chandan");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it3 = set.iterator();
		while (it3.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it3.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

	}

}
