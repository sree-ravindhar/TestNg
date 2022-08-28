package Data.TestNG_Example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseClass {

	@BeforeTest
	private void launch() {

		browserLaunch("edge");
		getUrl("https://letcode.in/alert");

	}

	/*
	 * This is for validation purpose wheather the expected dosent meet actual test
	 * fails and stop the execution
	 */
	@Test
	private void hardAssert() {

		WebElement findElement = findElement("id", "accept");
		findElement.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		assertEquals(text, "Hey! Welcome to LetCode");

		System.out.println("sysout");

	}

	/*
	 * This is for validation purpose wheather the expected dosent meet actual test
	 * fails it will continue the execution assertAll() is must to find wheather the
	 * test is fail or not
	 */

	@Test
	private void softAssertE() {
		WebElement findElement = findElement("id", "accept");
		findElement.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		SoftAssert a = new SoftAssert();
		a.assertEquals(text, "Hey! Welcome to etCode");
		System.out.println("sree");
		a.assertAll();

	}

}
