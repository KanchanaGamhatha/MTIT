package reflection;

import java.lang.reflect.Field;

public class FinalTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 */
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		try {
			
			//Field before modification
			System.out.println(sample);
			
			//Re-assign through reflection
			Field field = sample.getClass().getDeclaredField("testString");
			field.setAccessible(true);
			field.set(sample, "Modified String");
			
			//Field After Modification
			System.out.println(sample);
			System.out.println(field.get(sample));
			
		} catch (NoSuchFieldException
				| SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

class Sample {

	public final String testString;
	
	public Sample() {
		this.testString = "Old String";
	}
	
	@Override
	public String toString() {
		return testString;
	}
}
