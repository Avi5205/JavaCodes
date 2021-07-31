package com.OOPS.WorkBook;

public class JTC17 {

	public static void main(String[] args) {
		ABC ref = new ABC("Welcome");
		ABC.PQR ref2 = ref.new PQR(3232);
		ref2.show();
		System.out.println();
		new ABC("THANKS").new PQR(4141).show();

	}

}

class ABC {
	static String stVar = "STATIC IN Outer";
	String var;

	ABC(String var) {
		this.var = var;
	}

	class PQR {
		final static String stVar = "STATIC IN Inner";
		int var;

		PQR(int var) {
			this.var = var;
		}

		void show() {
			boolean var = false;
			System.out.println("\n--in Show Method --in Inner Class--");
			System.out.println(var);
			System.out.println(this);
			System.out.println(this.var);
			System.out.println(ABC.stVar);
			System.out.println(PQR.stVar);
			System.out.println(ABC.this);
			System.out.println(ABC.this.var);
		}
	}
}