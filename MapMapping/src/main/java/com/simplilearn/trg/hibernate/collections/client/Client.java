package com.simplilearn.trg.hibernate.collections.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.simplilearn.trg.hibernate.collections.beans.Employee;

public class Client {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Java", 3);
		map1.put("Spring", 1);
		map1.put("Hibernate", 1);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Angular", 3);
		map2.put("ReactJS", 1);
		map2.put("Java", 1);
		
		Employee employee1 = new Employee("Ramlal", map1);
		Employee employee2 = new Employee("Shamlal", map2);
		
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
