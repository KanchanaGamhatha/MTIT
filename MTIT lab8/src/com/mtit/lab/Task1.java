package com.mtit.lab;

import java.lang.reflect.Modifier;

public class Task1 {
	public static void main(String[] args) {
		try {
		Class<?> clazz = Class.forName("com.mtit.lab.Task1");
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackage());
		System.out.println(clazz.getModifiers());
		System.out.println(clazz.getDeclaredMethod("main", String[].class));
		System.out.println(Modifier.toString(clazz.getDeclaredMethod(
		"main", String[].class).getModifiers()));
		} catch (ClassNotFoundException | NoSuchMethodException
		| SecurityException e) {
		e.printStackTrace();
		}
		}
	/*
	 * 
	 * public = 1
	 * private = 2
	 * protected = 4
	 * default = 0
	 * static = 8
	 * final = 16
	 * static final = 24
	 * strictfp = 2048
	 * 
	 * 
	 * 
	*/
	

}
