package Data.TestNG_Example;

import org.testng.annotations.*;

public class DataProviderExample extends BaseClass {

	@Test(dataProvider = "getData")
	private void methodOne(String email, String pass) {

		browserLaunch("edge");
		getUrl("http://www.facebook.com");
		PomClass a = new PomClass(driver);
		sendkeyss(a.getEmail(), email);
		sendkeyss(a.getPass(), pass);
		clickk(a.getLogin());

	}

	@DataProvider
	private Object[][] getData() {

		Object[][] a = new Object[3][2];

		a[0][0] = "abc@gmail.com";
		a[0][1] = "123456";

		a[1][0] = "def@gmail.com";
		a[1][1] = "78945SS";

		a[2][0] = "ghi@gmail.com";
		a[2][1] = "78652";
		return a;
	}

}
