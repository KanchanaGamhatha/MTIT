package com.mtit.lab;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		displayMethods();
		executeMethod();
	}
	
	public static void executeMethod() 
	{
		try
		{
		Employee employee = new Employee();
		
		Class[] parameters =  new Class[4];
		parameters[0] = String.class;
		parameters[1] = String.class;
		parameters[2] = String.class;
		parameters[3] = Double.TYPE;
		
		Method method = employee.getClass().getDeclaredMethod("display", parameters);
		
		String result = (String) method.invoke(employee, "E100","Upul","Malabe",80_000.00);
		System.out.println(result);
		
		}catch (IllegalArgumentException | IllegalAccessException
				| SecurityException | NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void displayMethods() 
	{
		//Get declared methods of Employee Class
		for (Method method : new Employee().getClass().getDeclaredMethods())
		{
			System.out.println("Modifier => "
					+ Modifier.toString(method.getModifiers()));
			System.out.print("|| Return type =>" + method.getReturnType());
			System.out.print("|| Method name =>" + method.getName());
			
			//Display the parameters if there are parameters
			if(method.getParameterTypes().length > 0)
			{
				System.out.println(" Method Parameters => " );
				
				
				//Get all parameter types of the method
				for(Class<?> type : method.getParameterTypes())
				{
					System.out.print(type.getSimpleName()+" ");
				}
				System.out.println();
			}
			else
			{
				System.out.println();
			}
			System.out.println();
			
		}
	}
	
}
