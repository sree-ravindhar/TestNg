package Data.TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample extends BaseClass {
	
	@Test
	@Parameters({"email","pass"})
	private void methodOne(String email , String pass) {
		
		browserLaunch("edge");
		getUrl("http://www.facebook.com");
		PomClass a = new PomClass(driver);
		sendkeyss(a.getEmail(), email);
		sendkeyss(a.getPass(), pass);
		
		

	}

}
