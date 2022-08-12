package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.Classes;
import com.simplilearn.ph2.dto.Students;
import com.simplilearn.ph2.dto.Subjects;
import com.simplilearn.ph2.dto.Teachers;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class ClassesDaoImpl implements ClassesDao {
	private Connection connection;
	
	public ClassesDaoImpl() {
	connection = new ConnectionManagerImpl().getConnection();
	
	}

	@Override
	public Set<Classes> getallClasses() {
		Set<Classes> allClss = new HashSet<Classes>();
		String query = "select *  from classes";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Classes classes = new Classes(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
				allClss.add(classes);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allClss;
	}

	@Override
	public Set<Subjects> getallSubjects() {
		Set<Subjects> allSubs = new HashSet<Subjects>();
		String query = "select *  from subjects";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Subjects subjects = new Subjects(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3));
				allSubs.add(subjects);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allSubs;
	}

	@Override
	public Set<Teachers> getallTeachers() {
		Set<Teachers> allTeac = new HashSet<Teachers>();
		String query = "select *  from teachers";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Teachers teachers = new Teachers(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3),resultSet.getString(4));
				allTeac.add(teachers);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTeac;
	}

	@Override
	public Set<Students> getallStudents() {
		Set<Students> allStud = new HashSet<Students>();
		String query = "select *  from students";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				Students students = new Students(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5));
				allStud.add(students);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allStud;
	}

	
}
