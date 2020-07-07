package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
	
		String UserDirectoryPath =  System.getProperty("user.dir");
		System.out.println("User Directory is : "+UserDirectoryPath);
		String fileSeperator = System.getProperty("file.separator");
		String chromeDriverPath = 	UserDirectoryPath+fileSeperator+"drivers"+fileSeperator+"chromedriver"+fileSeperator+"chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        //System.setProperty("webdriver.ie.driver",ProjectPath+"\\drivers\\internetexplorerdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(); 

        driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		


		driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("this test is skipped");
	}
}
