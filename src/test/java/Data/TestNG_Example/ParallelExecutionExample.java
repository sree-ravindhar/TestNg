package Data.TestNG_Example;

import org.testng.annotations.*;

public class ParallelExecutionExample extends BaseClass {
	

	@Test

	private void methodOne() {

		browserLaunch("edge");
		getUrl("http://www.facebook.com");
		PomClass a = new PomClass(driver);
		sendkeyss(a.getEmail(), "abcmail.com");

	}

	@Test

	private void methodTwo() {

		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");

	}


}
