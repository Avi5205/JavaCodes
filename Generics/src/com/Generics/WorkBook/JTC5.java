package com.Generics.WorkBook;

public class JTC5 {

	public static void main(String[] args) {
		VarArgsService service = new VarArgsService();
//		service.m1();
//		service.m1(12);
//		service.m1(12, 34,54);
		service.m1(12, 43);
		System.out.println();
		service.m1Value(new int[] {});
		service.m1Value(new int[] { 12, 23, 45 });
		service.m1Value(new int[] { 12 });
		service.m1Value(new int[] { 65, 78, 98, 876, 56 });
//		service.m1Value(123);
		System.out.println();
		service.m2();
		service.m2(12);
		service.m2(10, 20, 30, 40);
		service.m2(45, 85);
		service.m2(10, 20, 30, 40, 85, 74);
		service.m2(new int[] { 12, 43, 56, 78, 98 });
		System.out.println();
		service.add("Som", 4521.25, "Som@jtc.org", "Som@jtc.org", "Som@gmail.com");
		service.add("Som", 4521.25);
	}

}

class VarArgsService {
	void m1(int ab, int bc) {
		System.out.println("--m1(int,int)--");
	}

	void m1Value(int ab[]) {
		System.out.println("--m1(int[])--");
	}

	void m2(int... value) {
		System.out.println("--m2(int...)--\t:" + value.length);
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i] + ",");
		}
		System.out.println();
	}

	void m2(int ab) {
		System.out.println("--m2(int)--");
	}

	void m2(long val, double val2) {
		System.out.println("--m2(long,double)");
	}

	void add(String name, double fee, String... emails) {
		System.out.println("**add(String,double,String)");
		for (String em1 : emails) {
			System.out.println(em1);
		}
	}
	// void add(String name, double fee, String []emails) {}
	// void m1(long...phone,String name){}
	// void m2(long...phone,String... name){}
}