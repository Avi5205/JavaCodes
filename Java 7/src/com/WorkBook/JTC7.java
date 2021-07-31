package com.WorkBook;

public class JTC7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Before Java 7

public class ObjectCreator {
	public static Object getInstance(String className) throws Exception {
		Object ref = null;
		try {
			Class cl = Class.forName(className);
			ref = cl.newInstance();
		} catch (Exception e) {
			// Send mail to Mail ID
			throw e;
		}
		return ref;
	}
}


// From Java 7

public class ObjectCreator {
	public static Object getInstance(String className)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		Object ref = null;
		try {
			Class cl = Class.forName(className);
			ref = cl.newInstance();
		} catch (Exception e) {
// Send mail to Mail ID
			throw e;
		}
		return ref;
	}
}