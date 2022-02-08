package com.jtcindia.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JTC23C {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			Book b1 = session.load(Book.class, 1);
			OrderItem oi1 = new OrderItem(1, 1100);
			oi1.setBook(b1);
			session.save(oi1);
			Book b2 = session.load(Book.class, 2);
			OrderItem oi2 = new OrderItem(1, 2200);
			oi2.setBook(b2);
			session.save(oi2);
			ShippingAddress add = new ShippingAddress("SEC2", "NOIDA", "UP");
			session.save(add);
			Set<OrderItem> orderItems = new HashSet<>();
			orderItems.add(oi1);
			orderItems.add(oi2);
			Order order = new Order(1, 3300.0, new Date(), "New");
			order.setAddress(add);
			order.setOrderItems(orderItems);
			order.setCustomer(cust);
			session.save(order);
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
