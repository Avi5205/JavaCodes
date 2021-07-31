package com.OOPS.WorkBook;

public class JTC2 {

	public static void main(String[] args) {
		int ab = 98;
		System.out.println("AB in Main Before\t:"+ab);
		MNO ref = new MNO();
		ref.showValue(ab);
		System.out.println("AB in Main After\t:"+ab);
	}

}
class MNO{
	void showValue(int ab) {
		System.out.println("Before show value\t:"+ab);
		if(ab != 0) {
			showValue(ab/10);
			System.out.println("After show value\t:"+ab);
		}
	}
}