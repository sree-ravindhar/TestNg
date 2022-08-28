package Data.TestNG_Example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeOutsExample extends BaseClass {

	@BeforeTest
	private void lauch() {
		browserLaunch("edge");

	}

	@Test(timeOut = 2000)
	private void timeOutExample() {

		getUrl("http://www.udemy.com");

	}

}
