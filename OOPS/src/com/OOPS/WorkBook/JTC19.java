package com.OOPS.WorkBook;

public class JTC19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Inter11 {
	void show();
}

interface Inter22 {
	int show();
}

//class CD implements Inter11,Inter22{
////	public void show() {}
//	//public int show() {}
//}
class AB implements Inter11 {
	public void show() {
	}
}

class BC implements Inter22 {
	public int show() {
		return 0;
	}
}