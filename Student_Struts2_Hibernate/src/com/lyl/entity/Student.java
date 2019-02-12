package com.lyl.entity;

public class Student {
	private int Student_id;
	private String Student_name;
	private String Student_password;
	public Student(){
		
	}
	public Student(int id, String name, String password) {
		this.Student_id = id;
		this.Student_name = name;
		this.Student_password = password;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(Integer student_id) {
		Student_id = student_id;
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
