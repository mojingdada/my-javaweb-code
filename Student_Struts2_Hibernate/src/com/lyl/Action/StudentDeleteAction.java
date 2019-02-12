package com.lyl.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.lyl.Service.studentService;
@SuppressWarnings("serial")
public class StudentDeleteAction extends ActionSupport {
	private int id;
	private studentService studentService;
	public void setstudentService(studentService studentService) {
		this.studentService = studentService;
	}
	public String execute(){
		studentService.deleteStudent(id);
			return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
