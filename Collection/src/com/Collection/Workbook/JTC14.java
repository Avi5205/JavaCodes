package com.Collection.Workbook;

import java.io.*;
import java.util.*;

public class JTC14 {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws Exception, IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		p.load(fis);
		Enumeration en = p.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			System.out.println(key + "\t" + p.getProperty(key));
		}
		fis.close();
		System.out.println("H\tHindi");
		System.out.println("E\tEnglish");
		System.out.println("Enter Language Code");
		char ch = (char) System.in.read();
		ch = Character.toUpperCase(ch);
		Locale loc = new Locale("en", "IN");
		if (ch == 'H')
			loc = new Locale("hi", "IN");
		else if (ch == 'E')
			loc = new Locale("en", "IN");
		else System.out.println("Not valid Option, Reading English Language");
		System.out.println("\n----Resource Bundle ----");
		System.out.println(loc);
		ResourceBundle rb = ResourceBundle.getBundle("data", loc);
		Enumeration en1 = rb.getKeys();
		while (en1.hasMoreElements()) {
			String ky = (String) en1.nextElement();
			System.out.println(ky + "\t" + rb.getString(ky));
		}
		System.out.println("\n----Reading specific key value --");
		String val = rb.getString("sid");
		System.out.println("Value of\t:" + val);
	}
}
