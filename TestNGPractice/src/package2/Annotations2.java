package package2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeTest
	public void method1() {
		System.out.println("Before Test");
	}

	@Test(dataProvider = "getdata")
	public void methodx(String userid, String password) {
		System.out.println(userid);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];

		data[0][0] = "123";
		data[0][1] = "xxx";
		data[1][0] = "456";
		data[1][1] = "yyy";
		return data;

	}

	@AfterTest
	public void method2() {
		System.out.println("After Test");
	}

}
