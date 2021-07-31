package com.OOPS.WorkBook;

public class JTC12 {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) throws Exception {
		if (args.length == 1) {
			String cName = args[0];
			ClassLoader load = MNO.class.getClassLoader();
			Class cl = Class.forName(cName, false, load);
			System.out.println("--Class Loaded\t:" + cl.getName());
			System.out.println("SuperClass\t:" + cl.getSuperclass());
			System.out.println("\n====================");
			Object obj = cl.newInstance();
			System.out.println(obj);
		} else {
			System.out.println("MNO");
		}
	}
}
