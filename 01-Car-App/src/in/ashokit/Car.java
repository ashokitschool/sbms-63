package in.ashokit;

public class Car {

	public void drive() {

		Engine eng = new Engine();

		boolean status = eng.start();
		if (status) {
			System.out.println("Engine started...");
			System.out.println("Journey started...");
		} else {
			System.out.println("Engine having trouble...");
		}
	}
}
