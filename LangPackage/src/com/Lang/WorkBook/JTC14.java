package com.Lang.WorkBook;

public class JTC14{
	public static void main(String[] args){
		String st = "JTCINDIA";
		char arr[] = st.toCharArray();
		for(int i = 0; i < arr.length; i++){
			char c = arr[i];
			System.out.println(i+"\t"+c);
		}
		System.out.println("-------------");
		byte bArr[] = st.getBytes();
		for(int i = 0; i < bArr.length;i++){
			byte b = bArr[i];
			System.out.println(i+"\t"+b+"\t"+(char)b);
		}
		System.out.println("--------------");
		char chArr[] = new char[10];
		st.getChars(2,6,chArr,0);
		for(int i = 0; i < chArr.length; i++){
			char c = chArr[i];
			System.out.println(i+"\t"+c);
		}
		System.out.println("\n-----------");
		char chArr1[] = new char[10];
		st.getChars(2,6,chArr1,4);
		for(int i = 0; i < chArr1.length; i++){
			char c = chArr1[i];
			System.out.println(i+"\t"+c);
		}
	}
}
