package testcases.ninenow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
