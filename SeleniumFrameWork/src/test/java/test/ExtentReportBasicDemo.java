package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		// start report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
	
        String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("http://google.com");
		test1.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered test in searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Pressed keyboard entered key");
        
        driver.close();
        driver.quit();
        test1.pass("closed the browser");
        test1.info("test completed");
        
        
        
        
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "this is a test to validate google search functionality");
	
        projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting Test Case");
		driver.get("http://google.com");
		test2.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test2.pass("Entered test in searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test2.fail("Pressed keyboard entered key");
        
        driver.close();
        driver.quit();
        test1.pass("closed the browser");
        test2.info("test completed");
        // calling flush writes everything to the log file
        extent.flush();
 
	}

}
