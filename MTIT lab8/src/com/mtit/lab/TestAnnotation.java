package com.mtit.lab;

public class TestAnnotation {

	
	@Test(priority = 2, dependsOnMethods = {"testCase2","testCase3"},
			description = "This represent annotation test case1", groups ={"com.MTIT"})
	public String testCase1()
	{
		return "Annotation test case1";
	}
	
	@Test(description = "This represent annotation test case2", groups ={"com.MTIT"})
	public String testCase2()
	{
		return "Annotation test case2";
	}
	
	@Test(description = "This represent annotation test case3")
	public String testCase3()
	{
		return "Annotation test case3";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
