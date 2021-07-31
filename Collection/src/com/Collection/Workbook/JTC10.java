package com.Collection.Workbook;

import java.util.*;

public class JTC10 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM));
		Calendar cal1 = Calendar.getInstance();
		cal.set(Calendar.DATE, 20);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 2010);
		System.out.println(cal.after(cal1));
		System.out.println(cal.before(cal1));
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getTimeInMillis());

		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getDate());
		System.out.println(dt.getMonth());
		System.out.println(dt.getMonth() + 1);
		System.out.println(dt.getYear());
		System.out.println(dt.getYear() + 1900);
		System.out.println(dt.getHours());
		System.out.println(dt.getMinutes());
		System.out.println(dt.getSeconds());
		System.out.println(dt.getTime());

		int day = dt.getDay();
		String str = "";
		switch (day) {

		case 0:
			str = "Sunday";
			break;
		case 1:
			str = "Monday";
			break;
		case 2:
			str = "Tuesday";
			break;
		case 3:
			str = "Wednesday";
			break;
		case 4:
			str = "Thrusday";
			break;
		case 5:
			str = "Friday";
			break;
		case 6:
			str = "Saturday";
			break;

		}
		System.out.println(day + "\t" + str);
		Date dt1 = new Date(110, 1, 12);
		System.out.println(dt1);
		System.out.println(dt.after(dt1));
		System.out.println(dt.before(dt1));
		System.out.println(dt.after(dt));
		System.out.println(dt.before(dt));
		dt.setDate(10);
		dt.setMonth(0);
		dt.setYear(110);
		dt.setHours(12);
		dt.setMinutes(53);
		dt.setSeconds(55);
		System.out.println("****After Setting new Date****\n" + dt);

	}

}
