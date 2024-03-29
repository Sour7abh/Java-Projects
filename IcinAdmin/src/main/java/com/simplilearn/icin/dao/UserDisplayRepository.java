package com.simplilearn.icin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.icin.model.User;
import com.simplilearn.icin.model.UserDisplay;

@Repository
public interface UserDisplayRepository extends JpaRepository<User, Integer>{
	
	@Query("SELECT new com.simplilearn.icin.model.UserDisplay(u.fname,u.lname,u.phone,u.username,u.status,u.featureStatus,a.accno,a.balance,s.accno,s.balance)" + "FROM User u ,Account a,Saccount s WHERE u.username=a.username and u.username=s.username")
	public List<UserDisplay> getAllUsers();
	
	@Query("SELECT new com.simplilearn.icin.model.UserDisplay(u.fname,u.lname,u.phone,u.username,u.status,u.featureStatus,a.accno,a.balance,s.accno,s.balance)" + "FROM User u ,Account a,Saccount s WHERE u.username=?1 and u.username=a.username and u.username=s.username")
	public UserDisplay getUserDetailsByUsername(String userDetail);
	
	@Query("SELECT new com.simplilearn.icin.model.UserDisplay(u.fname,u.lname,u.phone,u.username,u.status,u.featureStatus,a.accno,a.balance,s.accno,s.balance)" + "FROM User u ,Account a,Saccount s WHERE s.accno=?1 and u.username=a.username and u.username=s.username")
	public UserDisplay getUserDetailsByAccountNo(long accNo);
	
	
	
}
