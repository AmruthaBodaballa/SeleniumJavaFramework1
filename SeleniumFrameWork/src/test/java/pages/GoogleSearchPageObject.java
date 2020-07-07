package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPageObject {

	WebDriver driver = null;
	
	By textbox_search = By.id("lst-ib");
	By button_search = By.name("btnk");
	
	public GoogleSearchPageObject(WebDriver driver) {
		 this.driver = driver;
	}

	public void setTextInSearchBox(String text)  {
		
		driver.findElement(textbox_search).sendKeys("text");
		
	}
	public void ClickSearchbutton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
