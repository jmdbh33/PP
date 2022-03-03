package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {

	public static WebDriver driver;

	public static void openBrowser(String s) {

		switch(s) 
		{
		case "chrome":
			System.setProperty(common.chromekey, common.chromepath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			break;

		case "firefox":
			System.setProperty(common.firefoxkey, common.firefoxpath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		default:
			System.setProperty(common.chromekey, common.chromepath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			break;
		}

		// TODO Auto-generated method stub

	}
	
	
	public static void getUrl(String url) {
		driver.get(url);
		
	}
	
	public static void closeBrowser() {
		driver.quit();
		
	}
	
	
	
}
