package com.lyl.Action;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.lyl.entity.Student;
import com.lyl.Service.studentService;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class StudentQueryAction extends ActionSupport {
	private studentService studentService;
	public studentService getStudentService() {
		return studentService;
	}
	public void setStudentService(studentService studentService) {
		this.studentService = studentService;
	}
	public String execute(){	
			List<Student> studentlist=studentService.findAll();
			ServletActionContext.getRequest().setAttribute("studentlist", studentlist);
			return SUCCESS;
	}
}
