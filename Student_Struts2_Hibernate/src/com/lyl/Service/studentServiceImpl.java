package com.lyl.Service;
import java.util.List;
import com.lyl.DAO.StudentDao;
import com.lyl.entity.Student;
public class studentServiceImpl implements studentService {
	private StudentDao StudentDao;
	public void setStudentDao(StudentDao StudentDao){
		this.StudentDao=StudentDao;
	}
	public void saveStudent(Student student) {
		if(StudentDao.findById(student.getStudent_id())==null)
			StudentDao.save(student);
	}
	public Student getStudent_name(String Student_name) {
		return StudentDao.getStudent_name(Student_name);
	}
	public void deleteStudent(int id) {
		if(StudentDao.findById(id)!=null)
			StudentDao.delete(id);
		
	}
	public Student findUserById(int id) {
		return StudentDao.findById(id);
	}
	public List<Student> findAll() {
		return StudentDao.findAll();
	}

	
	
}
