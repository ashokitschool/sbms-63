package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserService uservice = context.getBean(UserService.class);

		// uservice.saveUser();
		// uservice.saveUsers();
		// uservice.getUserById();
		// uservice.getMultipleUsersByIds();
		// uservice.getAll();
		// uservice.demo();
		// uservice.delete();
		// uservice.getUsersByGender();
		// uservice.getUsersByGenderCountry();
		// uservice.getUsersByAge();
		// uservice.getAllUsersWithHQL();
		
		uservice.deleteUserByHQL();
	}
}
