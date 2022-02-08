package com.jtcindia.hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JTC23D {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = session.load(Customer.class, 1);
			System.out.println("Customer Info");
			System.out
					.println(cust.getCid() + "\t" + cust.getCname() + "\t" + cust.getEmail() + "\t" + cust.getPhone());
			CreditCard cc = cust.getCcard();
			System.out.println("CCinfo:");
			ShippingAddress add = session.load(ShippingAddress.class, 1);
//            System.out.println(add.getCcid()+"\t"+add.getCcno()+ "\t"+add.getCode()+"\t"+add.getCtype());
			Set<Order> ods = cust.getOrders();
			for (Order o : ods) {
				System.out.println("order info");
				System.out.println(
						o.getOrderId() + "\t" + o.getTotalQty() + "\t" + o.getTotalCost() + "\t" + o.getStatus());
				add = o.getAddress();
				System.out.println("Shiping Address;#" + o.getOrderId());
				System.out.println(
						add.getAddid() + "\t" + add.getStreet() + "\t" + add.getCity() + "\t" + add.getState());
				Set<OrderItem> items = o.getOrderItems();
				System.out.println("Order items:#" + "\t" + o.getOrderId());
				for (OrderItem oit : items) {
					System.out.println(
							oit.getOtid() + "\t" + oit.getCost() + "\t" + oit.getQty() + "\t" + oit.getBook().getBid());

				}
			}
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

}
