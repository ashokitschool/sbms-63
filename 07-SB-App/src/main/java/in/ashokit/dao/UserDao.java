package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}

	public String findNameById(int id) {
		if (id == 100) {
			return "John";
		} else if (id == 101) {
			return "Smith";
		} else {
			return "Invalid Id";
		}
	}
}
