package com.simplilearn.hibernate.trg.dao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.hibernate.trg.dto.Customer;
import com.simplilearn.hibernate.trg.util.SessionFactoryManagerImpl;


public class CustomerDaoImpl implements CustomerDAO{
	private SessionFactory factory;
	
	public CustomerDaoImpl() {
	factory = new SessionFactoryManagerImpl().getSessionFactory();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Integer customerId = (Integer) session.save(customer);
		
		transaction.commit();
		session.close();
		return customerId;
	}

	@Override
	public void updateCustomer(int customerId, String address) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		//get method returns the object that holds data for specified Id
		customer.setAddress(address);
		session.update(customer);
		transaction.commit();
		session.close();
		}

	@Override
	public void deleteCustomer(int customerId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
	}

	@Override
	public Customer searchCustomer(int customerId) {
		Session session = factory.openSession();
		
		//Customer customer = session.get(Customer.class, customerId);
		
		Customer customer = null;
		String hql = "From Customer c where c.customerId =" +customerId;
		TypedQuery<Customer> query = session.createQuery(hql);
		customer = query.getSingleResult();
		session.close();
		return customer;
	}

	@Override
	public Set<Customer> getAllCustomers() {
		Set<Customer> allCustomers = null;
		Session session = factory.openSession();
		//sql query will be = select * from customerdata
		String hql = "FROM Customer";
		TypedQuery<Customer> typedQuery = session.createQuery(hql);
		List<Customer> customers = typedQuery.getResultList();
		allCustomers = new LinkedHashSet<Customer>(customers);
		session.close();
		return allCustomers;
	}

	@Override
	public List<String> getAllCustomerNames() {
		Session session = factory.openSession();
		String hql = "select c.customerName from Customer c ";
		TypedQuery<String> query = session.createQuery(hql);
		List<String> names = query.getResultList();
		session.close();
		return names;
	}

}
