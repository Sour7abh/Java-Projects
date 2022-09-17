package com.simplilearn.trg.hibernate.annotationway.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.simplilearn.trg.hibernate.annotationway.beans.Student;

public class Client {
	public static void main(String[] args) {
		// read configuration file & establish the connection with the database
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		// create an object which needs to be persisted
				Student student1 = new Student("Ramlal", "Sharma", "A+");
				Student student2 = new Student("Ram", "Verma", "A");
				
				// create an object of Session to add the object in database table
				Session session = factory.openSession();
				Transaction transaction = session.beginTransaction();
				
				int rollNo1 = (int) session.save(student1);
				int rollNo2 = (int) session.save(student2);
				
				// if not commited, the changes will not reflect into the database
				transaction.commit();
				System.out.println("roll no is : " + rollNo1);
				System.out.println("roll no is : " + rollNo2);
				
				
				factory.close();
			}
}




