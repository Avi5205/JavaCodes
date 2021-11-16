package com.luv2code.hibernate.mapping.oneTooneBi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start transaction
			session.beginTransaction();

			// get instructor by primary key / id
			int theId = 2;

			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Found instructor : " + tempInstructor);

			// delete the instructors

			if (tempInstructor != null) {
				System.out.println("Deleting : " + tempInstructor);

				// Note : will ALSO delete associated "details" object
				// because of CascadeType.ALL
				//
				session.delete(tempInstructor);
			}

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
