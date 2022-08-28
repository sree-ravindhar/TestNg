package Data.TestNG_Example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FailShot extends BaseClass {

	@BeforeMethod
	private void launch() {

		browserLaunch("edge");
		getUrl("https://letcode.in/alert");

	}

	@Test
	private void hardAssert() {

		WebElement findElement = findElement("id", "accept");
		String text = findElement.getText();
		assertEquals(text, "12345");

	}

}
