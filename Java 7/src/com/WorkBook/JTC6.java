package com.WorkBook;
import java.io.FileInputStream;

public class JTC6 {

	public static void main(String[] args) {
		long res1 = ResourceUser.readFile("info.txt");
		System.out.println("In main Result\t:" + res1);
		System.out.println();
		long res3 = ResourceUser.readFile("Empty.java");
		System.out.println("In main Result\t:"+res3);
	}
}

class ResourceUser{
	static long readFile(String fileName) {
		System.out.println("--File Name in Method\t:"+fileName);
		long length = 0;
		try (JtcResource resource = new JtcResource();
		FileInputStream fis = new FileInputStream(fileName);
			/* JtcAnotherResource other=new JtcAnotherResource(); */){
			while(true) {
				int x = fis.read();
				if(x == -1)
					break;
				length++;
			}
			long res = 13/length;
			System.out.println("Result\t:" + res);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return length;
	}
}
class JtcResource implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("**close method() of JtcResource**\t:"+this);
	}
}
class JtcAnotherResource{
	
}