package com.OOPS.WorkBook;

public class JTC4 {

	public static void main(String[] args) {
		MethodParamService ref = new MethodParamService();
		System.out.println("===PRIMITIVE===");
		int ab = 123;
		System.out.println("In main before\t:" + ab);
		ref.modify(ab);
		System.out.println("In main after\t:" + ab);

		System.out.println("\n===REFERENCE===");
		User ur = new User();
		ur.uid = 101;
		ur.phone = 6526668L;
		System.out.println("In Main Before\t:" + ur.uid + "\t" + ur.phone);
		ref.modify(ur);
		System.out.println("In Main After\t:" + ur.uid + "\t" + ur.phone);
		System.out.println("\n");
		System.out.println("In Main Before\t:" + ur.uid + "\t" + ur.phone);
		ref.change(ur);
		System.out.println("In Main After\t:" + ur.uid + "\t" + ur.phone);
	}

}

class MethodParamService {
	void modify(int ab) {
		System.out.println("--modify(int)--");
		System.out.println("Before Modifying\t:" + ab);
		ab = ab + 1000;
		System.out.println("After Modifying\t:" + ab);
	}

	void modify(User user) {
		System.out.println("--modify(User)--");
		System.out.println("Before Modifying\t:" + user.uid + "\t" + user.phone);
		user.uid = user.uid + 1000;
		user.phone = 9999999999999L;
	}

	void change(User user) {
		System.out.println("--change(User)--");
		System.out.println("Before Modifying\t:" + user.uid + "\t" + user.phone);
		user.uid = user.uid + 1000;
		user.phone = 9999999999L;
		System.out.println("After Modifying data\t:" + user.uid + "\t" + user.phone);
	}
}

class User {
	int uid;
	long phone;
}