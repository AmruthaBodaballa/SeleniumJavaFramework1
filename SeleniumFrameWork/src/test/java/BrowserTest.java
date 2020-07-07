import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String projectpath = System.getProperty("user.dir");
		//System.out.println("projectpath : "+projectpath);
		//WebDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver();
		//driver.get("http://seleniumhq.org/");
		//driver.close();



		String UserDirectoryPath =  System.getProperty("user.dir");
		System.out.println("User Directory is : "+UserDirectoryPath);
		String fileSeperator = System.getProperty("file.separator");
		String chromeDriverPath = 	UserDirectoryPath+fileSeperator+"drivers"+fileSeperator+"chromedriver"+fileSeperator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);

		String InterentExplorerDriverPath =UserDirectoryPath+fileSeperator+"drivers"+fileSeperator+"internetexplorerdriver"+fileSeperator+"IEDriverServer.exe"; 
		System.setProperty("webdriver.ie.driver",InterentExplorerDriverPath);
		WebDriver myDriver = new InternetExplorerDriver(); 
		myDriver.get("https://www.google.co.in");
		myDriver.close();
	}

}
