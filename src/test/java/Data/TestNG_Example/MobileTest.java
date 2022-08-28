package Data.TestNG_Example;

import org.testng.annotations.Test;

public class MobileTest {

	@Test(groups = "smoke")
	private void mobileSearch() {
		System.out.println("Yes_Mobile");

	}
	@Test(groups = "smoke")
	private void motorolla() {
		System.out.println("Yes_Moto");

	}
	@Test(groups = "smoke")
	private void lenovo() {
		System.out.println("Yes_Lenovo");

	}
	@Test
	private void onePlus() {
		System.out.println("Yes_onePlus");

	}
	@Test
	private void micromax() {
		System.out.println("Yes_Micromax");

	}
	

}
