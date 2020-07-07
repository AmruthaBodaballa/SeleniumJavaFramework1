package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {


	public static void main(String[] args) {
		googleSearch();

	}

	public static void googleSearch()  {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String UserDirectoryPath =  System.getProperty("user.dir");
		System.out.println("User Directory is : "+UserDirectoryPath);
		String fileSeperator = System.getProperty("file.separator");
		String chromeDriverPath = 	UserDirectoryPath+fileSeperator+"drivers"+fileSeperator+"chromedriver"+fileSeperator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver driver = new ChromeDriver();*/
		//we have to go to google.com
		driver.get("https:// google.com");
		
		//enter search in textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//click on search button  
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}

}
