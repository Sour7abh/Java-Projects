package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dto.Classes;
import com.simplilearn.ph2.dto.Students;
import com.simplilearn.ph2.dto.Subjects;
import com.simplilearn.ph2.dto.Teachers;

public interface ClassesService {
	
	Set<Classes> getallClasses();
	Set<Subjects> getallSubjects();
	Set<Teachers> getallTeachers();
	Set<Students> getallStudents();
}
