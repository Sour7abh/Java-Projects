package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.ContractEmployee;
import com.beans.Employee;
import com.beans.RegularEmployee;

public class Client {
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Employee employee =  new Employee("Neeta");
		RegularEmployee regularemployee = new RegularEmployee("Seeta", 50000, 10000);
		ContractEmployee contractemployee = new ContractEmployee("Geeta", 5000, "24 months");
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(employee);
		session.save(regularemployee);
		session.save(contractemployee);
		txn.commit();
		session.close();
		System.out.println("All Employees : ");
		session = factory.openSession();
		List<Employee> allEmployees = session.createQuery("FROM Employee").getResultList();
		System.out.println(allEmployees);
		session.close();
		
		System.out.println("All Regular Employees : ");
		session = factory.openSession();
		List<RegularEmployee> allRegularEmployees = session.createQuery("FROM RegularEmployee").getResultList();
		System.out.println(allRegularEmployees);
		session.close();
		
		System.out.println("All Contract Employees : ");
		session = factory.openSession();
		List<ContractEmployee> allContractEmployees = session.createQuery("FROM ContractEmployee").getResultList();
		System.out.println(allContractEmployees);
		session.close();
		
		factory.close();
	}

}
