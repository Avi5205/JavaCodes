package com.luv2code.hibernate.mapping.OneToManyBi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

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

			// create the objects

//			Instructor tempInstructor = new Instructor("Avinash", "Kumar", "akgpcamp@gmail.com");
//
//			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "Java Code");

			Instructor tempInstructor = new Instructor("Avinash", "Kumar", "daffy.duck@gmail.com");

			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "Teaching");

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

			session.close();
			factory.close();
		}

	}

}
