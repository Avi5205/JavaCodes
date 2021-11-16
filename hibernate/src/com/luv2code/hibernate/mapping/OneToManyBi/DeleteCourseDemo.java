package com.luv2code.hibernate.mapping.OneToManyBi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get a course
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);

			// delete course
			System.out.println("Deleting course : " + tempCourse);
			session.delete(tempCourse);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("\nDone!");

		} finally {

			session.close();
			factory.close();
		}

	}

}
