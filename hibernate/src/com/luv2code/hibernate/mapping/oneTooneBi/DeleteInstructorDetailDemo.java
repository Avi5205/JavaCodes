package com.luv2code.hibernate.mapping.oneTooneBi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

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

			// get instructor detail object

			int theId = 1;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);

			// print the instructor detail
			System.out.println("tempInstructorDetail : " + tempInstructorDetail);

			// print the associated instructor
			System.out.println("\nthe associated instructor : " + tempInstructorDetail.getInstructor());

			// now let's delete the instructor detail
			System.out.println("\nDeleting tempInstructorDetail : " + tempInstructorDetail);

			// remove the associated object refernce
			// break bi-directional link
			//
			tempInstructorDetail.getInstructor().setInstructorDetail(null);

			session.delete(tempInstructorDetail);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// handle connection leak issue
			session.close();
			factory.close();
		}

	}

}
