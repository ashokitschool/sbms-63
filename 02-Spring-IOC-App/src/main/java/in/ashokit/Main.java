package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// start IOC by giving xml file as input
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");

		Car car = ctxt.getBean(Car.class);

		car.drive();

	}
}
