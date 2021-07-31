package com.Generics.WorkBook;

import java.util.*;

public class JTC13 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Welcom");
		list.add("SomPrakash");
		list.add("Prakash");
		list.add("Anand");
		System.out.println("\n--Using Normal For Statement(List)--");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("\n--Using Normal Statement(int[])--");
		int arr[] = new int[] { 12, 34, 56, 76, 765, 33 };
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			System.out.println(val);
		}
		System.out.println("\n--Using Normal For Statement(int[][])--");
		int dArr[][] = new int[][] { { 14, 32, 56 }, { 19, 43, 65 }, { 98, 45, 63, 27 } };
		for (int i = 0; i < dArr.length; i++) {
			int[] tArr = dArr[i];
			for (int j = 0; j < tArr.length; j++) {
				int val = tArr[j];
				System.out.print(val + "\t");
			}
			System.out.println();
		}
		System.out.println("\n***for each statement(List)**");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("\n**for each statement(int[])**");
		for (int val : arr) {
			System.out.println(val);

		}

		System.out.println("\n**for each statement(int[][])**");
		for (int tArr[] : dArr) {
			for (int val : tArr) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
	}

}
