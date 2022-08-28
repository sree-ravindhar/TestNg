package Data.TestNG_Example;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class ExceptionExample {
	
	@Test(expectedExceptions = Exception.class)
	private void example() {
		int a = 0;
		int b = a/0;
		System.out.println(b);

	}

}
