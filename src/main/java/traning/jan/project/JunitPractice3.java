package traning.jan.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitPractice3 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	@ Before
	public void before() {
		System.out.println("Before");
	}
	@Test
	public void test() {
		System.out.println("Test");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass() {
	System.out.println("After Class");
	}
	}