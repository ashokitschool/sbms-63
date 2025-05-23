package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserService bean = context.getBean(UserService.class);

		// bean.getUsersByPageNum(3);

		// bean.getUsersWithSorting();

		bean.getUsersWithQBE();
	}

}
