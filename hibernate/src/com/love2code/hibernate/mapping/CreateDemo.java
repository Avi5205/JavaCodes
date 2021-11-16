package com.love2code.hibernate.mapping;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// create the objects

//			Instructor tempInstructor = new Instructor("Avinash", "Kumar", "akgpcamp@gmail.com");
//
//			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "Java Code");

			Instructor tempInstructor = new Instructor("Kajal", "Kumari", "kajal@gmail.com");

			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "Gossip");

			// associate the objects

			tempInstructor.setInstructorDetail(tempInstructorDetail);

			// start a transaction
			session.beginTransaction();

			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL
			//
			System.out.println("Saving instructor : " + tempInstructor);
			session.save(tempInstructor);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
