package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entities.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	private static final int pageSize = 3;

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public void getUsersWithQBE() {

		User user = new User();
		// user.setGender("Male");
		// user.setCountry("India");
		// user.setAge(22);

		Example<User> example = Example.of(user);

		List<User> all = userRepo.findAll(example);

		all.forEach(System.out::println);
	}

	public void getUsersWithSorting() {

		Sort sort = Sort.by("age").ascending(); // order by age

		List<User> all = userRepo.findAll(sort); // select * from user order by age

		all.forEach(System.out::println);
	}

	public void getUsersByPageNum(int pageNum) {

		// represents pagination
		PageRequest page = PageRequest.of(pageNum - 1, pageSize);

		Page<User> pageData = userRepo.findAll(page);

		List<User> usersData = pageData.getContent();
		// Stream<User> stream = pageData.get();

		usersData.forEach(System.out::println);
	}
}
