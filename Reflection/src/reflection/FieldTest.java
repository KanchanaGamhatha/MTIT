package reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class FieldTest {

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
			priceField.set(book, 150.50);
			System.out.println(priceField.getName() + " = " + priceField.get(book));
		} 
		catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}
}

class Book {

	private String bookName = "Oracle Book";

	public int bookCount = 20;
	
	public String [] authors = {"Udara", "Anupiya", "Tharindu"};
	
	public double price;

}