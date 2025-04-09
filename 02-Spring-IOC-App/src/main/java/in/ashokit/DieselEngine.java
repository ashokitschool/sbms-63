package in.ashokit;

public class DieselEngine implements IEngine{

	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}
	
	public boolean start() {
		System.out.println("DieselEngine started...");
		return true;
	}
}
