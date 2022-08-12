package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.ClassesDao;
import com.simplilearn.ph2.dao.ClassesDaoImpl;
import com.simplilearn.ph2.dto.Classes;
import com.simplilearn.ph2.dto.Students;
import com.simplilearn.ph2.dto.Subjects;
import com.simplilearn.ph2.dto.Teachers;

public class ClassesServiceImpl implements ClassesService{
	private ClassesDao classesDao;
	
	public ClassesServiceImpl() {
		classesDao = new ClassesDaoImpl();
	}
	@Override
	public Set<Classes> getallClasses() {
		return classesDao.getallClasses();
	}

	@Override
	public Set<Subjects> getallSubjects() {
		return classesDao.getallSubjects();
	}

	@Override
	public Set<Teachers> getallTeachers() {
		return classesDao.getallTeachers();
	}

	@Override
	public Set<Students> getallStudents() {
		return classesDao.getallStudents();
	}

}
