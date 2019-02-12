package com.lyl.Action;

import java.util.Iterator;
import java.util.List;

import com.lyl.Service.studentService;
import com.lyl.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	String Student_name;
	String Student_password;

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getStudent_password() {
		return Student_password;
	}

	public void setStudent_password(String student_password) {
		Student_password = student_password;
	}
	private studentService studentService;
	public void setstudentService(studentService studentService) {
		this.studentService = studentService;
	}
	public String execute() {
		List<Student> list = (List<Student>) studentService.findAll();
		Student u = new Student();
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			u = (Student) it.next();
			if (Student_name.trim().equals(u.getStudent_name())
					&& Student_password.trim().equals(u.getStudent_password()))
				return "success";;
		}
		if(Student_name.trim().equals("admin") && Student_password.trim().equals("admin"))
			return "admin";
		String page = "failer";
		return page;
	}
}
