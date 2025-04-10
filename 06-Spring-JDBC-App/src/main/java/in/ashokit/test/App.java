package in.ashokit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.dao.StudentDao;
import in.ashokit.dto.Student;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

		StudentDao sdao = ctxt.getBean(StudentDao.class);

		/*
		 * Student student = new Student(); student.setId(2); student.setName("John");
		 * student.setCity("Vizag");
		 * 
		 * int cnt = sdao.insert(student); System.out.println("Record Inserted : " +
		 * cnt);
		 */

		// sdao.update(2, "Smith");

		List<Student> students = sdao.getStudents();
		students.forEach(System.out::println);

	}
}
