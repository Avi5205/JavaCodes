package com.luv2code.hibernate.mapping.OneToManyBi;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {

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

			// get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			// create some courses
			Course tempCourse1 = new Course("Hibernate");
			Course tempCourse2 = new Course("Spring");
			Course tempCourse3 = new Course("JDBC");
			Course tempCourse4 = new Course("Servlet");
			Course tempCourse5 = new Course("Exception Handling");
			Course tempCourse6 = new Course("Collection Framework");
			Course tempCourse7 = new Course("Advance Java");
			Course tempCourse8 = new Course("Core Java");

			// add courses to instructor
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			tempInstructor.add(tempCourse3);
			tempInstructor.add(tempCourse4);
			tempInstructor.add(tempCourse5);
			tempInstructor.add(tempCourse6);
			tempInstructor.add(tempCourse7);
			tempInstructor.add(tempCourse8);

			// save the courses
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.save(tempCourse3);
			session.save(tempCourse4);
			session.save(tempCourse5);
			session.save(tempCourse6);
			session.save(tempCourse7);
			session.save(tempCourse8);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {

			session.close();
			factory.close();
		}

	}

}
