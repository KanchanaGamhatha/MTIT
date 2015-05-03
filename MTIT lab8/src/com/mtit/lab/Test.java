package com.mtit.lab;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
int priority() default 1;
String description();
String [] groups() default "";
String [] dependsOnMethods() default "";
}