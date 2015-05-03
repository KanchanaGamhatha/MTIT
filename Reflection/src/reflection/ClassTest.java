package reflection;

import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws NoSuchMethodException {
		
		try 
		{
			//Access the class method (1) 
			Class clazz = Class.forName("reflection.Test");
			System.out.println(clazz);
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage());
			System.out.println(clazz.getModifiers());
			System.out.println(clazz.getDeclaredMethod("print"));
						
		} 
		catch (ClassNotFoundException | SecurityException e) 
		{
			e.printStackTrace();
		}
		Test test = new Test();
		//Get package details of a class
		System.out.println(test.getClass().getPackage());
		
	}
}
class Test {
	public void print() {
		System.out.println("SLIIT");
	}
}
