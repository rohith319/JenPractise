package com.test;

import org.testng.annotations.Test;

public class Jenkinstest {
	public static int i=10;
	
	 public static void ab()
	 {
		 System.out.println("abc");
	 }
	 @Test
	 public void test()
	 {
	 
	
		 Jenkinstest t1=new Jenkinstest();
		 Jenkinstest.ab();
		 System.out.print(t1.i);
	 }
	

}
