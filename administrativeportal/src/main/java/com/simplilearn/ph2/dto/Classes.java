package com.simplilearn.ph2.dto;

public class Classes {
	
	private int section;
	private String teacher;
	private String subject;
	private String time;
	private String students_list;
	
	public Classes() {}

	public Classes(int section, String teacher, String subject, String time, String students_list) {
		this.section = section;
		this.teacher = teacher;
		this.subject = subject;
		this.time = time;
		this.students_list = students_list;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStudents_list() {
		return students_list;
	}

	public void setStudents_list(String students_list) {
		this.students_list = students_list;
	}

	
}
