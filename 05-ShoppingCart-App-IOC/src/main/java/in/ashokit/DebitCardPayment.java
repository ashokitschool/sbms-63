package in.ashokit;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("DebitCard payment success...");
		return true;
	}

}
