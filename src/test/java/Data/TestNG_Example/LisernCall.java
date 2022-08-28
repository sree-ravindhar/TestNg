package Data.TestNG_Example;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LisernCall extends BaseClass {
	
	@Test(expectedExceptions = NoSuchElementException.class)
	private void example() {
		browserLaunch("edge");
		PomClass a = new PomClass(driver);
		a.getLogin().click();

	}

}
