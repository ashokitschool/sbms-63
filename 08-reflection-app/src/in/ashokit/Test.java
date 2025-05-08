package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("in.ashokit.User");

		Object obj = clz.getDeclaredConstructor().newInstance();

		User u = (User) obj;

		u.printAge(); // before setting value for private variable

		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);

		field.set(u, 25); // setting value for private var

		u.printAge(); // after setting value for private variable

	}
}
