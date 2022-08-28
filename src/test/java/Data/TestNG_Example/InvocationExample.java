package Data.TestNG_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationExample extends BaseClass {

	@BeforeTest
	private void launch() {

		browserLaunch("edge");
		getUrl("http://automationpractice.com/index." + "php?id_product=2&controller=product");

	}

	@Test(invocationCount = 10, invocationTimeOut = 500)
	private void qtyIncrease() {

		WebElement findElement = driver.findElement(By.cssSelector(".btn.btn-default.button-plus.product_quantity_up"));
		findElement.click();
	}
}
