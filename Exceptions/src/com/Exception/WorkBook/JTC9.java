package com.Exception.WorkBook;

public class JTC9 {

	public static void main(String[] args) {
		EmployeeService serv = new EmployeeService();
		try {
			serv.getEmployeeName(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			serv.getEmployeeName("111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			serv.getEmployeeName("JT-99111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			String nm = serv.getEmployeeName("JTC-222");
			System.out.println("Name in Main\t:" + nm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n--Main Completed--");
	}

}

class EmployeeService {
	String getEmployeeName(String id) throws InvalidEmployeeIdException {
		String nm = null;
		if (id == null) {
			throw new NullPointerException();
		} else if (id.length() != 7) {
			throw new InvalidEmployeeIdException(id);
		} else if (!id.startsWith("JTC")) {
			throw new InvalidEmployeeIdException(id);
		} else {
			nm = "Somprakash";
			return nm;
		}
	}
}

@SuppressWarnings("serial")
class InvalidEmployeeIdException extends Exception {
	InvalidEmployeeIdException(String id) {
		super(id);
	}
}