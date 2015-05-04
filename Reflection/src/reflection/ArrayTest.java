package reflection;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] stringArray = (String []) Array.newInstance(String.class, 3);
		
		Array.set(stringArray, 0, "Udara");
		Array.set(stringArray, 1, "SLIIT");
		Array.set(stringArray, 2, "MTIT");

		System.out.println("stringArray[0] = " + Array.get(stringArray, 0));
		System.out.println("stringArray[1] = " + Array.get(stringArray, 1));
		System.out.println("stringArray[2] = " + Array.get(stringArray, 2));
	}
}
