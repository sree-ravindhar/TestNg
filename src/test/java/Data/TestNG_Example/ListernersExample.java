package Data.TestNG_Example;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersExample extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			takeScreenShot(result.getMethod().getMethodName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	

}
