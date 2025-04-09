package in.ashokit;

public class Car {

	private IEngine eng;

	public Car() {
		System.out.println("Car :: Default Constructor");
	}

	public Car(IEngine eng) {
		System.out.println("Car :: Param Constructor");
		this.eng = eng;
	}

	public void setEng(IEngine eng) {
		System.out.println("setter method....");
		this.eng = eng;
	}

	public void drive() {

		boolean status = eng.start();

		if (status) {
			System.out.println("Journey Started..");
		} else {
			System.out.println("Engine Trouble...");
		}
	}
}
