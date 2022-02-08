package com.jtcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory = null;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg = cfg.configure("hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getFactory() {
		return factory;
	}
}
