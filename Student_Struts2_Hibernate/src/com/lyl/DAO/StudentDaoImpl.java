package com.lyl.DAO;
import java.util.List;
import com.lyl.entity.Student;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao{
	public void save(Student student) {
		this.getHibernateTemplate().save(student);		
	}
	public Student getStudent_name(String name)
	{ 
		String hsql="from Student u where u.stu_name='"+name+"'";
		Student result=(Student)((Query) this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
	}	
	public void delete(int id) {
			this.getHibernateTemplate().delete(findById(id));
	}	
	public Student findById(int id) {
		Student student = (Student) this.getHibernateTemplate().get(Student.class, id);
			return student;
	}	
	@SuppressWarnings("unchecked")
	public List<Student> findAll() {
			String queryString = "from Student";
			List<Student> list =this.getHibernateTemplate().find(queryString);
			return list;
	}
}