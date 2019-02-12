package com.lyl.Action;

import com.lyl.entity.Student;
import com.lyl.Service.studentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StudentAction extends ActionSupport {
	private studentService studentService;
	public void setStudentService(studentService studentService) {
		this.studentService = studentService;
	}
	private String Student_name;
	private String Student_password;
	public String execute(){
		Student u=new Student();
		u.setStudent_name(getStudent_name());
		u.setStudent_password(getStudent_password());
		studentService.saveStudent(u);
		return "student";
	}
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
}
