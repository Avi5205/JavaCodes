package com.Collection.Workbook;

import java.util.*;

public class JTC11 {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		Locale locales[] = Locale.getAvailableLocales();
		for (int i = 0; i < locales.length; i++) {
			System.out.println(locales[i] + ",");
		}
		String countries[] = Locale.getISOCountries();
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i] + ",");
		}
		String language[] = Locale.getISOLanguages();
		for (int i = 0; i < language.length; i++) {
			System.out.println(language[i] + ",");
		}
		System.out.println();
		Locale loc = new Locale("EN");
		System.out.println(loc.getCountry());
		System.out.println(loc.getDisplayCountry());
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayName());
		System.out.println(loc.getVariant());
		System.out.println(loc.getDisplayVariant());
		Locale loc1 = new Locale("EN", "US");
		System.out.println(loc1.getCountry());
		System.out.println(loc1.getDisplayCountry());
		System.out.println(loc1.getDisplayLanguage());
		System.out.println(loc1.getDisplayName());

	}

}
