package in.ashokit;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("CreditCard payment success...");
		return true;
	}

}
