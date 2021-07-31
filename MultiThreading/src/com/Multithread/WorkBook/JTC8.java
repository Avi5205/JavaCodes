package com.Multithread.WorkBook;

public class JTC8 {

	public static void main(String[] args) {
		JTCthread11 ath = new JTCthread11();
		JTCthread22 bth = new JTCthread22();
		bth.setThreadToJoin(ath);
		ath.start();
		bth.start();
	}

}

class JTCthread11 extends Thread {

	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("JTH\t" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class JTCthread22 extends Thread {
	Thread th = null;
	
	void setThreadToJoin(Thread th) {
		this.th = th;
	}
	public void run() {
		for(int i = 100; i < 115; i++) {
			try {
				if(i == 105) {
					th.join();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}