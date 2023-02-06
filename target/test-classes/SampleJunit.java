package com.sample.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit {
	
@BeforeClass
public static void beforeClass() {
	System.out.println("Before Class"); //Launch Browser
}
@Before
public void before() {
	System.out.println("Before"); //pass Url
}
@Test
public void test1() {
	System.out.println("Test 1");//Valid Credentials
}
@Test
public void test3() {
	System.out.println("Test 3"); //Sample
}
@Ignore
@Test
public void test2() {
	System.out.println("Test 2"); //Invalid Credentials
}
@After
public void after() {
	System.out.println("After"); //test completed
}
@AfterClass
public static void afterClass() {
	System.out.println("After Class"); //close method
}
}
