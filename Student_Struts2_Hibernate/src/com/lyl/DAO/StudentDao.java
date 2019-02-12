package com.lyl.DAO;

import java.util.List;

import com.lyl.entity.Student;

public interface StudentDao {
	void save(Student student);

	Student getStudent_name(String Student_name);

	void delete(int id);

	Student findById(int id);

	List<Student> findAll();
}
