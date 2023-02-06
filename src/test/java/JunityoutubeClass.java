import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class JunityoutubeClass {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
@BeforeTest
public void before() {
	System.out.println("Before");
}
@Test
public void test() {
	System.out.println("Test");
}
@AfterTest
public void after() {
	System.out.println("After");
}
@AfterClass
public static void afterClass() {
	System.out.println("After Class");
}
}
