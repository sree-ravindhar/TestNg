package Data.TestNG_Example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RetryAnalyzer {

	@Test(retryAnalyzer = Retry.class)
	private void retryAnalyzer() {

		assertEquals("sree", "123");

	}

	@Test
	private void methodTwo() {

		assertEquals("sree", "sree");

	}

}
