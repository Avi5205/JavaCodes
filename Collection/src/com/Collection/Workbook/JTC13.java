package com.Collection.Workbook;

import java.util.*;

public class JTC13 {

	public static void main(String[] args) {
		System.out.println("About to schedule task");
		new Remainder(5);
		System.out.println("Task scheduled.");
	}

}

class Remainder {

	Timer timer;

	public Remainder(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
	}

	class RemindTask extends TimerTask {
		public void run() {
			System.out.println("Time's up!");
			timer.cancel();
		}
	}
}
