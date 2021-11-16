package com.luv2code.hibernate.demo;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query the students
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display the students
			displayStudents(theStudents);

			// query students : last name = 'Duck'
			theStudents = session.createQuery("from Student s where s.lastName='Duck'").getResultList();

			// display the students
			System.out.println("\n\nStudents who have last name of Duck :");
			displayStudents(theStudents);

			// query students: lastName = "Duck" OR firstName = "Mia"

			theStudents = session.createQuery("from Student s where" + " s.lastName = 'Duck' OR s.firstName='Mia'")
					.getResultList();

			// display the students
			System.out.println("\n\nStudents who have last name of Duck Or First Name of Mia :");
			displayStudents(theStudents);

			// query students where email's LIKE '%luv2code.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();
			System.out.println("\n\nStudents who email ends with luv2code.com :");
			displayStudents(theStudents);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
