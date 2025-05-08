package in.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Motor {

	@PostConstruct
	public void start() {
		System.out.println("Motor getting started....");
	}

	public void doWork() {
		System.out.println("Motor is running...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Motor stopped...");
	}

}
