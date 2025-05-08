package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entities.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void deleteUserByHQL() {
		userRepo.deleteUserByHQL(102);
	}

	public void getAllUsersWithHQL() {
		List<User> allUsersHQL = userRepo.getAllUsersHQL();
		allUsersHQL.forEach(System.out::println);
	}

	public void getUsersByAge() {
		List<User> byAge = userRepo.findByAgeGreaterThanEqual(20);
		byAge.forEach(System.out::println);
	}

	public void getUsersByGenderCountry() {
		List<User> byGender = userRepo.findByGenderAndCountry("Male", "India");
		byGender.forEach(System.out::println);
	}

	public void getUsersByGender() {
		List<User> byGender = userRepo.findByGender("Male");
		byGender.forEach(System.out::println);
	}

	public void delete() {
		userRepo.deleteById(104);
	}

	public void demo() {
		boolean existsById = userRepo.existsById(101);
		if (existsById) {
			System.out.println("Record present");
		} else {
			System.out.println("Record not present");
		}
	}

	public void getAll() {
		Iterable<User> all = userRepo.findAll();
		all.forEach(System.out::println);
	}

	public void getMultipleUsersByIds() {
		Iterable<User> allById = userRepo.findAllById(Arrays.asList(564, 789));
		allById.forEach(System.out::println);
	}

	public void getUserById() {
		Optional<User> byId = userRepo.findById(201);

		if (byId.isPresent()) {
			User user = byId.get();
			System.out.println(user);
		} else {
			System.out.println("No Record Found");
		}
	}

	public void saveUsers() {

		User entity1 = new User();
		entity1.setUid(103);
		entity1.setUname("Robert");
		entity1.setGender("Male");
		entity1.setCountry("UK");
		entity1.setAge(24);

		User entity2 = new User();
		entity2.setUid(104);
		entity2.setUname("David");
		entity2.setGender("Male");
		entity2.setCountry("Japan");
		entity2.setAge(34);

		userRepo.saveAll(Arrays.asList(entity1, entity2));

		System.out.println("Users Saved....");
	}

	public void saveUser() {

		User entity = new User();

		entity.setUid(102);
		entity.setUname("Rani");
		entity.setGender("Fe-Male");
		entity.setCountry("USA");
		entity.setAge(24);

		userRepo.save(entity);

		System.out.println("User Saved....");
	}
}
