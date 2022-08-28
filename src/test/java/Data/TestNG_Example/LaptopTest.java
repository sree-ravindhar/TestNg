package Data.TestNG_Example;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaptopTest {
	@BeforeSuite
	private void methodOne() {
		System.out.println("Launched");

	}
	@BeforeTest
	private void urlLa() {
		System.out.println("URL");

	}
	@BeforeClass
	private void classTest() {
		System.out.println("LoginSucced");

	}
	@Test
	private void laptopSearch() {
		System.out.println("Yes_Laptop");

	}
	@Test(groups = "smoke")
	private void lenovoTest() {
		System.out.println("/*/*/*/*/*/*/*/*/*/");

	}

}
