package com.jtcindia.hibernate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JTC23B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			CreditCard cc1 = new CreditCard(1111, "visa", 999, new Date());
			session.save(cc1);
			SilverCustomer c1 = new SilverCustomer("jtc", "jtc@jtc", 1234, "Noida", 10, "c@jtc");
			c1.setCcard(cc1);
			session.save(c1);
			Map<String, String> refs = new HashMap<>();
			refs.put("AA", "11");
			refs.put("BB", "22");
			CreditCard cc2 = new CreditCard(2222, "jtcprak", 999, new Date());
			session.save(cc2);
			GoldCustomer c2 = new GoldCustomer("Praveen", "Praveen@jtc", 1234, 4321, refs, 1000);
			c2.setCcard(cc2);
			session.save(c2);
			tx.commit();
			session.close();
			System.out.println("record inserted");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
