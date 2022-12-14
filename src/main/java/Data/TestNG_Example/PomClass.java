package Data.TestNG_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(name = "pass")
	private WebElement pass;
	@FindBy(name = "login")
	private WebElement login;

	public PomClass(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
