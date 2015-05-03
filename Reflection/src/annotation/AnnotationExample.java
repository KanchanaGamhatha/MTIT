package annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnnotationExample {

	@Override
	@MethodInfo(author = "SLIIT", comments = "Main method", date = "Jan 04 2015", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Jan 05 2015")
	public static void oldMethod(String value) {
		System.out.println("Old method, don't use it.");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@MethodInfo(author = "Udara", comments = "Main method", 
	date = "Jan 06 2015", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List list = new ArrayList();
		list.add("abc");
		oldMethod("value");
	}
}
