package Data.TestNG_Example;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else if (browsername.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			}

			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void takeScreenShot(String fileName) throws IOException {

		try {

			TakesScreenshot a = (TakesScreenshot) driver;
			File screenshotAs = a.getScreenshotAs(OutputType.FILE);
			File b = new File("E:\\Mine\\TestNG_Example\\Shots\\" + fileName);
			FileUtils.copyFile(screenshotAs, b);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static WebElement findElement(String Option, String Value) {

		try {
			if (Option.equalsIgnoreCase("id")) {

				WebElement id = driver.findElement(By.id(Value));
				return id;

			} else if (Option.equalsIgnoreCase("xpath")) {

				WebElement xpath = driver.findElement(By.xpath(Value));
				return xpath;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void dropDown(WebElement element, String option, String value) {

		try {
			Select a = new Select(element);

			if (option.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				a.selectByIndex(parseInt);

			} else if (option.equalsIgnoreCase("value")) {

				a.selectByValue(value);

			} else if (option.equalsIgnoreCase("text")) {

				a.selectByVisibleText(value);

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sendkeyss(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void clickk(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
