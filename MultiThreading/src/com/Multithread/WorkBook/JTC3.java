package com.Multithread.WorkBook;

public class JTC3 {

	public static void main(String[] args) {
		JTCThread1 jth1 = new JTCThread1();
		JTCThread2 jth2 = new JTCThread2();
		jth1.start();
		jth2.start();
	}
}

class JTCThread1 extends Thread {

	public void run() {
		Service serv = new Service();
		serv.downloadFile();
	}
}

class JTCThread2 extends Thread {

	public void run() {
		Service serv = new Service();
		serv.readJTCStudentInfo();
	}
}

class Service {

	void downloadFile() {
		for (int i = 0; i <= 100; i += 5) {
			System.out.println("Download\t" + i + "%");
		}
	}

	void readJTCStudentInfo() {
		for (int i = 0; i < 51; i++) {
			System.out.println("JTCStudent with id\t" + i + "\tInformation");
		}
	}
}