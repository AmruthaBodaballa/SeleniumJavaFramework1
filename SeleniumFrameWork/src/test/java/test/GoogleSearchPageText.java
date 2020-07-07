package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageText {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearchText();  
	}
	
	public static void googleSearchText() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		searchPageObj.ClickSearchbutton();
		
		driver.close();
		
	}

}
