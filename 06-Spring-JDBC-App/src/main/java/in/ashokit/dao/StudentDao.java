package in.ashokit.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dto.Student;
import in.ashokit.mapper.StudentRowMapper;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student s) {

		String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";

		// executing given sql query
		int cnt = jdbcTemplate.update(query, s.getId(), s.getName(), s.getCity());

		return cnt;
	}

	public int update(int id, String newName) {

		String query = "update student set name = ? where id= ?";

		// executing given sql query
		int cnt = jdbcTemplate.update(query, newName, id);

		return cnt;
	}

	public List<Student> getStudents() {

		String sql = "select * from student";

		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());

		return students;
	}

}
