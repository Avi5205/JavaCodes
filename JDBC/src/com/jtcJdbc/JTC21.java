package com.jtcJdbc;

import java.util.List;

public class JTC21 {
	public static void main(String[] args) {
		BookService bs = new BookService();
		// Verify user
		boolean valid = bs.verifyUser("system", "root");
		if (valid) {
			System.out.println("Login Success ! Redirect to home page");
		} else {
			System.out.println("Login failed ! try Again");
		}
		// Adding the Book
		Book b = new Book("Java", "som", "JTC", 250, 4);
		boolean res = bs.addBook(b);
		if (res) {
			System.out.println("Book added successfully");
		} else {
			System.out.println("Error while adding book info");
		}
		// update Book
		Book bk = new Book("Jdbc", "Somprakash", "Sp", 250, 5);
		bk.setBname("B-02");
		int a = bs.updateBook(bk);
		System.out.println("Book update:" + a);
		// Delete book
		int c = bs.deleteBook("B-01");
		System.out.println("Book Deleted:" + c);

		// Accessing Book By Bid
		System.out.println("Book By Bname");
		List<Book> list = bs.getBooksByBname("java");
		for (Book b1 : list) {
			System.out.println(b1);
		}
		// Accessing Book by Author
		System.out.println("Book By Author");
		List<Book> list1 = bs.getBooksByAuthor("som");
		for (Book b1 : list1) {
			System.out.println(b1);
		}
		// Accessing Book by Cost
		System.out.println("Book by Cost");
		List<Book> list2 = bs.getBooksByCost(250);
		for (Book b1 : list2) {
			System.out.println(b1);
		}
		// Accessing All Books
		System.out.println("All Books");
		List<Book> list3 = bs.getAllBooks();
		for (Book b1 : list3) {
			System.out.println(b1);
		}
	}
}
