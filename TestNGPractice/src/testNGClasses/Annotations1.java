package testNGClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {

	@BeforeTest
	public void method1() {
		System.out.println("Before Test");
	}

	@Test
	public void method() {
		System.out.println("Test");
	}

	@AfterTest
	public void method2() {
		System.out.println("After Test");
	}

}
