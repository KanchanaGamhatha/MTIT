package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {

	public static void main(String[] args) {
		
		try {
			for (Method method : AnnotationParsing.class.getClassLoader()
					.loadClass(("annotation.AnnotationExample")).getMethods()) {
			
				// checks if MethodInfo annotation is present for the method
				if (method.isAnnotationPresent(annotation.MethodInfo.class)) {
					
					// iterates all the annotations available in the method
					for (Annotation anno : method.getDeclaredAnnotations()) {
						System.out.println("Annotation in Method " + method.getName() + " = " + anno);
					}
					MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
					if (methodAnno.revision() == 1) {
						System.out.println("Method with revision no 1 = " +  method.getName());
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
