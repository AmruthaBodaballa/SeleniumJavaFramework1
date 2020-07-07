package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	public void OnTestStart(ITestResult result) {
		System.out.println("******** Test Started : "+result. getName());
	}
	
	public void OnTestSuccess(ITestResult result) {
		System.out.println("******** Test is Successfull : "+result. getName());

	}
	public void OnTestFailure(ITestResult result) {
		System.out.println("******** Test is Failed : "+result. getName());

	}
	public void OnTestSkipped(ITestResult result) {
		System.out.println("******** Test is Skipped : "+result. getName());

	}
	public void OnTestFailedButWithInTheSuccessPercentage(ITestResult result) {
		

	}
	public void OnStart(ITestContext context) {
		
	}
	public void OnFinish(ITestContext context) {
		System.out.println("******** Tests Completed : "+context. getName());
	}

}