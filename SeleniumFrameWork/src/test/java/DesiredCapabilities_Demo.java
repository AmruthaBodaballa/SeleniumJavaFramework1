import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String ProjectPath = System.getProperty("user.dir");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		
		System.setProperty("webdriver.ie.driver",ProjectPath+"\\drivers\\internetexplorerdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(); 


		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);


		driver.close();
		driver.quit();


	}

}
