package com.simplilearn.hibernate.collections.client;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.simplilearn.hibernate.collections.beans.Employee;

public class Client {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		//create list
		
		List<String> techstack1 = Arrays.asList("Java","String","hibernate", "Springboot");
		List<String> techstack2 = Arrays.asList("Angular","NodeJS","Javascript","Springboot","ReactJS");
		
		//create employee objects
		Employee employee1 = new Employee("Ramlal", new HashSet<String>(techstack2));
		Employee employee2 = new Employee("Shamlal", new HashSet<String>(techstack1));
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Integer empId1 = (Integer) session.save(employee1);
		Integer empId2 = (Integer) session.save(employee2);
		transaction.commit();
		System.out.println(empId1);
		System.out.println(empId2);
		session.close();
		
		Session session2 = factory.openSession();
		String hql = "FROM Employee";
		TypedQuery<Employee> query = session2.createQuery(hql);
		List<Employee> allEmps = query.getResultList();
		for (Employee employee : allEmps) {
			System.out.println(employee);
		}
		factory.close();
		
	}

}


