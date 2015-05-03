package com.mtit.lab;

import java.lang.reflect.Field;
import java.util.Arrays;


public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Book book = new Book();
			Class<?> clazz = book.getClass();
			
			//Access private field you have to set accessible true
			Field privateField = clazz.getDeclaredField("bookName");
			privateField.setAccessible(true);
			System.out.println(privateField.getName() + " = " + privateField.get(book));
			
			//Access public field 
			Field publicField = clazz.getField("bookCount");
			System.out.println(publicField.getName() + " = " + publicField.get(book));
			
			//print array of authors
			System.out.println("Authors = " +
			Arrays.asList((String [])clazz.getField("authors").get(book)));
			
			//Set value for price and display
			Field priceField = clazz.getField("price");
			priceField.set(book, 2187.50);
			System.out.println(priceField.getName() + " = " + priceField.get(book));
		} 
		catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

	}

}
