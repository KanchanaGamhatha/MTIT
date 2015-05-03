package com.mtit.lab;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.util.Arrays;
import java.util.Iterator;

public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Method method =  new TestAnnotation().getClass().getDeclaredMethod("testCase1");
			Annotation[] annotations = method.getDeclaredAnnotations();
			
			/*for (int i = 0; i < annotations.length; i++) {
				
			}*/
			
			for(Annotation annotation : annotations)
			{
				Test tesAnnt = (Test) annotation;
				System.out.println("Priority "+tesAnnt.priority());
				System.out.println("Description "+tesAnnt.description());
				System.out.println("Depends on methods "+Arrays.toString(tesAnnt.dependsOnMethods()));
				System.out.println("Groups "+Arrays.toString(tesAnnt.groups()));
			}
			
			
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
