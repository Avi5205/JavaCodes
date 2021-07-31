package com.Collection.Workbook;

import java.util.*;

public class JTC12 {

	public static void main(String[] args) {
		String str = "Welcome to Java Training Center to learn java  and advanve java. Thankyou";

		StringTokenizer token = new StringTokenizer(str);
		System.out.println(token.hasMoreTokens());
		System.out.println(token.countTokens());
		System.out.println();

		while (token.hasMoreTokens()) {
			String str1 = token.nextToken();
			System.out.println(str1);
		}
		System.out.println();
		System.out.println(token.hasMoreTokens());
		System.out.println(token.countTokens());

		System.out.println();
		StringTokenizer token1 = new StringTokenizer(str, "ja");
		System.out.println(token1.hasMoreTokens());
		System.out.println(token1.countTokens());
		System.out.println();

		while (token1.hasMoreElements()) {
			Object obj = token1.nextElement();
			System.out.println(obj);
		}
	}

}
