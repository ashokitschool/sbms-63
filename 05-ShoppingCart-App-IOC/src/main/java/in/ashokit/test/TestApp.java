package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.ShoppingCart;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

		ShoppingCart sc1 = ctxt.getBean(ShoppingCart.class);
		sc1.checkout();
	}
}
