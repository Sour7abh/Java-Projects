package com.simplilearn.ph2.controllers;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.ph2.dto.Classes;
import com.simplilearn.ph2.dto.Students;
import com.simplilearn.ph2.dto.Subjects;
import com.simplilearn.ph2.dto.Teachers;
import com.simplilearn.ph2.service.ClassesService;
import com.simplilearn.ph2.service.ClassesServiceImpl;


public class AcademyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			// read the "command" parameter
			String action = request.getParameter("command");
			ClassesService classesService = new ClassesServiceImpl();
			switch (action) {

			case "Classes":
				
				Set<Classes> allClss = classesService.getallClasses();
				
				HttpSession session = request.getSession();
				session.setAttribute("allClasses", allClss);
				response.sendRedirect("allClss.jsp");
				break;

			case "Teachers":
				
				Set<Teachers> allTeac = classesService.getallTeachers();
				
				HttpSession session1 = request.getSession();
				session1.setAttribute("allTeachers", allTeac);
				response.sendRedirect("allTeac.jsp");
				break;

			case "Subjects":
				
				Set<Subjects> allSubs = classesService.getallSubjects();
				
				HttpSession session11 = request.getSession();
				session11.setAttribute("allSubjects", allSubs);
				response.sendRedirect("allSubs.jsp");
				break;

			case "Students":
				
				Set<Students> allStud = classesService.getallStudents();
				
				HttpSession session111 = request.getSession();
				session111.setAttribute("allStudents", allStud);
				response.sendRedirect("allStud.jsp");
				break;

			case "Logout":
				
				response.sendRedirect("index.jsp");
			break;
			}
      }

	


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
