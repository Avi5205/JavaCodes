package com.jtcindia.hibernate;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Author {
	private int aid;
	private String aname;
	private String email;
	private Date dob;
	private long phone;
	private List<String> quails;
	private Set<String> exps;
	private Set<Book> books;

	public Author() {
	}

	public Author(String aname, String email, Date dob, long phone, List<String> quails, Set<String> exps,
			Set<Book> books) {

		this.aname = aname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.quails = quails;
		this.exps = exps;
		this.books = books;
	}

	public Author(String aname, String email, Date dob, long phone, List<String> quails, Set<String> exps) {
		this.aname = aname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.quails = quails;
		this.exps = exps;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getQuails() {
		return quails;
	}

	public void setQuails(List<String> quails) {
		this.quails = quails;
	}

	public Set<String> getExps() {
		return exps;
	}

	public void setExps(Set<String> exps) {
		this.exps = exps;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
