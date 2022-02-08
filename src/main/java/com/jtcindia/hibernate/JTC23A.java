package com.jtcindia.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JTC23A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			List<String> quails = new ArrayList<>();
			quails.add("MSC");
			quails.add("MCA");
			quails.add("M.Tech");

			Set<String> exps = new HashSet<>();
			exps.add("SUN");
			exps.add("IBM");
			exps.add("Oracle");

			Author a1 = new Author("JTC", "JTC@jtc", new Date(), 123, quails, exps);
			session.save(a1);

			Author a2 = new Author("Som", "Som@jtc", new Date(), 321, quails, exps);
			session.save(a2);

			Book b1 = new Book("Master Java", 99.99, 1, "jtc");
			session.save(b1);
			Book b2 = new Book("Master Hibernate", 99.99, 1, "jtc");
			session.save(b2);
			Book b3 = new Book("Master Spring", 99.99, 1, "jtc");
			session.save(b3);

			Set<Author> as1 = new HashSet<>();
			as1.add(a1);

			Set<Author> as2 = new HashSet<>();
			as2.add(a1);
			as2.add(a2);

			b1.setAuthors(as1);
			b2.setAuthors(as2);
			b3.setAuthors(as2);
			tx.commit();
			session.close();
			System.out.println("record inserted");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}
}
