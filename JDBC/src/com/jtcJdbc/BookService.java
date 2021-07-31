package com.jtcJdbc;

import com.WorkBook.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {
	public boolean verifyUser(String un, String pw) {
		boolean valid = false;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from user_table_1 where username=? and password=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if (rs.next()) {
				valid = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;
	}

	@SuppressWarnings("unused")
	public int deleteBook(String bid) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		int x = 0;
		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("delete from jtcbooks where bid =?");
			ps.setString(1, bid);
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	@SuppressWarnings("unused")
	public boolean addBook(Book bo) {
		boolean added = false;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("insert into jtcbooks values(?,?,?,?,?,?");
			ps.setString(1, bo.getNewBookId());
			ps.setString(2, bo.getBname());
			ps.setString(3, bo.getAuthor());
			ps.setString(4, bo.getPublication());
			ps.setDouble(5, bo.getCost());
			ps.setInt(6, bo.getEdition());
			ps.executeUpdate();
			added = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return added;
	}

	@SuppressWarnings("unused")
	public int updateBook(Book bo) {
		int x = 0;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement(
					"update jtcbooks set bname=?,Author=?,publication=?,cost=?,edition=?,where bid=?");
			ps.setString(1, bo.getBname());
			ps.setString(2, bo.getAuthor());
			ps.setString(3, bo.getPublication());
			ps.setDouble(4, bo.getCost());
			ps.setInt(5, bo.getEdition());
			ps.setString(6, bo.getBid());

			x = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	public Book getBookByBid(String bid) {
		Book bo = null;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from jtcbooks where bid =?");
			ps.setString(1, bid);
			rs = ps.executeQuery();

			if (rs.next()) {
				bo = getBookFromResultSet(rs);
				System.out.println(rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}

	public List<Book> getBooksByBname(String bname) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from jtcbooks where bname=?");
			ps.setString(1, bname);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	public List<Book> getBooksByAuthor(String Author) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from jtcbooks where Author=?");
			ps.setString(1, Author);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	public List<Book> getBooksByCost(double cost) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from jtcbooks where cost=?");
			ps.setDouble(1, cost);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	public List<Book> getAllBooks() {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			con = JdbcUtil.getOracleConnection();
			ps = con.prepareStatement("select * from jtcbooks");

			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	private Book getBookFromResultSet(ResultSet rs) throws SQLException {
		Book bo = new Book();
		bo.setBid(rs.getString(1));
		bo.setBname(rs.getString(2));
		bo.setAuthor(rs.getString(3));
		bo.setPublication(rs.getString(4));
		bo.setCost(rs.getDouble(5));
		bo.setEdition(rs.getInt(6));
		return bo;
	}
}
