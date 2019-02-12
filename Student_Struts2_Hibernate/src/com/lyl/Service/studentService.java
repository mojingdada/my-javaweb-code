package com.lyl.Service;
import java.util.List;
import com.lyl.entity.Student;
public interface studentService {
	void saveStudent(Student student);
	Student getStudent_name(String name);
	void deleteStudent(int id);
	Student findUserById(int id);
	List<Student> findAll() ;
}
