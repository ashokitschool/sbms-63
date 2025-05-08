package in.ashokit.beans;

import org.springframework.stereotype.Component;

import in.ashokit.dao.UserDao;

@Component
public class UserService {

	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public void printName(int id) {
		String nameById = userDao.findNameById(id);
		System.out.println(nameById);
	}
}